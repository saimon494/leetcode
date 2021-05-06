package com.leet.array;

// Given an integer array nums, move all 0's to the end of
// it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

public class MoveZeroes {

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                swap(nums, i, i + 1);
                for (int z = i - 1; (z + 1) > 0; z--) {
                    if (nums[z] == 0) {
                        swap(nums, z, z + 1);
                    }
                }
            }
        }

// moveZeroes with sort
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] > nums[i]) {
//                swap(nums, i, i + 1);
//                for (int z = i - 1; (z + 1) > 0; z--) {
//                    if (nums[z] == 0 || nums[z] > nums[z + 1]) {
//                        swap(nums, z, z + 1);
//                    }
//                }
//            }
//        }
    }
}