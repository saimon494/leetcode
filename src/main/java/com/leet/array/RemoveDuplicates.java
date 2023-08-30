package com.leet.array;

public class RemoveDuplicates {

    /**
     * 26. Remove Duplicates from Sorted Array
     * Given a sorted array nums, remove the duplicates in-place
     * such that each element appears only once and returns the new length.
     */
    public int removeDuplicates(int[] nums) {
//      Remove Duplicates from Sorted Array - 1 ms 43.9 MB
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

//        201 ms 40.7 MB
//        int key, newSize;
//        int[] newNums;
//        newSize = nums.length;
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