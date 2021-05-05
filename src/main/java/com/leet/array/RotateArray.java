package com.leet.array;

// Given an array, rotate the array to the right by k steps,
// where k is non-negative.

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
