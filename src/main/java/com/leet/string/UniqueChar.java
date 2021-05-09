package com.leet.string;

// Given a string s, return the first non-repeating character in it
// and return its index. If it does not exist, return -1.

public class UniqueChar {

    public int firstUniqChar(String s) {
        int count = -1;
        if (s == null || s.length() < 1) {
            return -1;
        } else if (s.length() == 1) {
            return 0;
        }
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                count = s.indexOf(ch);
                break;
            }

        }
        return count;
    }
}