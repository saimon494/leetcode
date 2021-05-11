package com.leet.string;

// Given a string s, determine if it is a palindrome,
// considering only alphanumeric characters and ignoring cases.

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        return (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()));
    }
}
