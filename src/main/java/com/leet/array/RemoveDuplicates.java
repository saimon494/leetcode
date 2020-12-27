package com.leet.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int key, newSize;
        int[] newNums;
        newSize = nums.length;

        for (int i = 0; i < newSize - 1; i++) {
            key = nums[i];
            for (int j = i + 1; j < newSize; j++) {
                if (key == nums[j]) {
                    newSize = newSize - 1;
                    for (int k = j; k < newSize; k++) {
                        nums[k] = nums[k + 1];
                    }
                    j--;
                }
            }
        }
        newNums = new int[newSize];
        for (int p = 0; p < newSize; p++) {
            newNums[p] = nums[p];
        }
        return newNums.length;
    }
}
