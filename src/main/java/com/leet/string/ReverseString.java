package com.leet.string;

// Write a function that reverses a string.
// The input string is given as an array of characters s.

public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = len - 1; j != i && i < len / 2; j--) {
                if (s[i] == s[j]) {
                    i++;
                    continue;
                }
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                i++;
            }
        }
    }
}