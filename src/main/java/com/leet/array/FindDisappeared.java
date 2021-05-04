package com.leet.array;

// Given an array nums of n integers
// where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.*;

public class FindDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

//        Arrays.sort(nums);
//        Set<Integer> set = new HashSet<>(nums.length);
//        for (int x : nums) {
//            set.add(x);
//        }
//        var list = new ArrayList<>(set);
//        var list2 = new ArrayList<Integer>();
//        for (int k = 1; k <= nums.length; k++) {
//            list2.add(k);
//        }
//        list2.removeAll(list);
//        return list2;
//    }
}
