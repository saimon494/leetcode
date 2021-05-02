package com.leet.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void whenFindDuplicates1() {
        var fd = new FindDuplicates();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] exp = {2, 3};
        var list = fd.findDuplicates(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenFindDuplicates2() {
        var fd = new FindDuplicates();
        int[] nums = {1, 1, 2};
        int[] exp = {1};
        var list = fd.findDuplicates(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenFindDuplicates3() {
        var fd = new FindDuplicates();
        int[] nums = {1};
        int[] exp = {};
        var list = fd.findDuplicates(nums);
        var rsl = list.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(exp, rsl);
    }
}