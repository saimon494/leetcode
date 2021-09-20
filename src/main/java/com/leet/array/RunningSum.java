package com.leet.array;

// Given an array nums. We define a running sum of an array
// as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int[] rsl = new int[nums.length];
        rsl[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsl[i] = rsl[i - 1] + nums[i];
        }
        return rsl;
    }
}
