package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunningSumTest {

    @Test
    public void whenSum1() {
        var rs = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        int[] out = rs.runningSum(nums);
        int[] exp = {1, 3, 6, 10};
        assertArrayEquals(exp, out);
    }

    @Test
    public void whenSum2() {
        var rs = new RunningSum();
        int[] nums = {1, 1, 1, 1, 1};
        int[] out = rs.runningSum(nums);
        int[] exp = {1, 2, 3, 4, 5};
        assertArrayEquals(exp, out);
    }

    @Test
    public void whenSum3() {
        var rs = new RunningSum();
        int[] nums = {3, 1, 2, 10, 1};
        int[] out = rs.runningSum(nums);
        int[] exp = {3, 4, 6, 16, 17};
        assertArrayEquals(exp, out);
    }
}