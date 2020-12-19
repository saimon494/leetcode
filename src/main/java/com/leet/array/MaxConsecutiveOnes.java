package com.leet.array;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count >= maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
