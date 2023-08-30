package com.leet.string;

import java.util.Stack;

public class ReverseVowels {
    /**
     * 345. Reverse Vowels of a String
     * Given a string s, reverse only all the vowels in the string and return it.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     */

    public String reverseVowels(String s) {
        // 252 ms 46.1 MB
        Stack<Character> stringStack = new Stack<>();
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) ==  'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) ==  'U') {
                stringStack.push(s.charAt(i));
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) ==  'u'
                    || s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) ==  'U') {
                newStr += stringStack.pop();
            } else {
                newStr += s.charAt(j);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        String s1 = "aA";
        System.out.println(s1);
        ReverseVowels reverse = new ReverseVowels();
        String s2 = reverse.reverseVowels(s1);
        System.out.println(s2); // "holle"
    }
}
