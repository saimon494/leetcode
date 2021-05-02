package com.leet.array;

// Given an integer array nums of length n
// where all the integers of nums are in the range [1, n] and
// each integer appears once or twice,
// return an array of all the integers that appears twice.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        var list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) {
                list.add(x);
            }
            set.add(x);
        }
        return list;
    }
}
