package com.leet.array;

import java.util.Arrays;

public class SearchInsertPosition {
    /**
     * 35. Search Insert Position
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public int searchInsert(int[] nums, int target) {
        int nElems = nums.length;
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound ) / 2;

            if (nums[curIn] == target) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return lowerBound;
            } else {
                if (nums[curIn] < target) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

}
