package com.leet.string;

// Given a string s and an integer array indices of the same length.
// The string s will be shuffled such that the character
// at the ith position moves to indices[i] in the shuffled string.
// Return the shuffled string.

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        StringBuilder rsl = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            rsl.setCharAt(indices[i], s.charAt(i));
        }
        return rsl.toString();
    }
}
