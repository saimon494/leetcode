package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void whenRotate1() {
        var ra = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] exp = {5, 6, 7, 1, 2, 3, 4};
        ra.rotate(nums, k);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenRotate2() {
        var ra = new RotateArray();
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] exp = {3, 99, -1, -100};
        ra.rotate(nums, k);
        assertArrayEquals(exp, nums);
    }
}