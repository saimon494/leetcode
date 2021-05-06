package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void whenTwoSum1() {
        var ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] exp = {0, 1};
        int[] rsl = ts.twoSum(nums, target);
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenTwoSum2() {
        var ts = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] exp = {1, 2};
        int[] rsl = ts.twoSum(nums, target);
        assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenTwoSum3() {
        var ts = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] exp = {0, 1};
        int[] rsl = ts.twoSum(nums, target);
        assertArrayEquals(exp, rsl);
    }
}