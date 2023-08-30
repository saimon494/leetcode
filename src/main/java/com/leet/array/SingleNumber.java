package com.leet.array;

// Given a non-empty array of integers nums,
// every element appears twice except for one.
// Find that single one.

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;

    // a    = 0011 1100
    // b    = 0000 1101
    // a^b  = 0011 0001

//        int rsl = 0;
//        var map = new HashMap<Integer, Boolean>();
//        Set<Integer> set = new HashSet<>(nums.length);
//        for (int x : nums) {
//            if (set.contains(x)) {
//                map.put(x, false);
//                continue;
//            }
//            set.add(x);
//            map.put(x, true);
//        }
//        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
//            if (entry.getValue().equals(true)) {
//                rsl = entry.getKey();
//            }
//        }
//        return rsl;
    }
}