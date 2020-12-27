package com.leet.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.toArray().length;
    }
}
