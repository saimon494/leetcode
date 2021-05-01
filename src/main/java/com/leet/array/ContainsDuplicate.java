package com.leet.array;

// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int count = 1;
        int countMax = 0;
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count++;
            } else {
                map.put(nums[i], i);
            }
            if (count > countMax) {
                countMax = count;
                count = 1;
            }
        }
        return countMax >= 2;
    }
}
