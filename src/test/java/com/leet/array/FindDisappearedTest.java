package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDisappearedTest {

    @Test
    public void whenFindDisappeared1() {
        var fd = new FindDisappeared();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] exp = {5, 6};
        var list = fd.findDisappearedNumbers(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenFindDisappeared2() {
        var fd = new FindDisappeared();
        int[] nums = {1, 1};
        int[] exp = {2};
        var list = fd.findDisappearedNumbers(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenFindDisappeared3() {
        var fd = new FindDisappeared();
        int[] nums = {10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
        int[] exp = {6, 8};
        var list = fd.findDisappearedNumbers(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }
}