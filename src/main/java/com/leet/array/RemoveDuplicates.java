package com.leet.array;

// Given a sorted array nums, remove the duplicates in-place
// such that each element appears only once and returns the new length.

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

//        int key, newSize;
//        int[] newNums;
//        newSize = nums.length;
//
//        for (int i = 0; i < newSize - 1; i++) {
//            key = nums[i];
//            for (int j = i + 1; j < newSize; j++) {
//                if (key == nums[j]) {
//                    newSize = newSize - 1;
//                    for (int k = j; k < newSize; k++) {
//                        nums[k] = nums[k + 1];
//                    }
//                    j--;
//                }
//            }
//        }
//        newNums = new int[newSize];
//        for (int p = 0; p < newSize; p++) {
//            newNums[p] = nums[p];
//        }
//        return newNums.length;
    }
}
