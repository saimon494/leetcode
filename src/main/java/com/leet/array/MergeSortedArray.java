package com.leet.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedArray {
    /**
     * 88. Merge Sorted Array
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = Arrays.copyOf(nums1, m + n);
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        MergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
