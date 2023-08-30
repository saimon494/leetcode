package com.leet.string;

import java.util.Random;
import java.util.Stack;

public class ReverseString {
    /**
     * 344. Reverse String
     * Write a function that reverses a string.
     * The input string is given as an array of characters s.
     */

    public static void reverseString(char[] s) {
//        4 ms 49.1 MB
        Stack<Character> stringStack = new Stack<>();

        for (char ch : s) {
            stringStack.push(ch);
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = stringStack.pop();
        }

//        1 ms 45.7 MB
//        int len = s.length;
//        for (int i = 0; i < len / 2; i++) {
//            for (int j = len - 1; j != i && i < len / 2; j--) {
//                if (s[i] == s[j]) {
//                    i++;
//                    continue;
//                }
//                char tmp = s[i];
//                s[i] = s[j];
//                s[j] = tmp;
//                i++;
//            }
//        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        String s1 = "abcdefg";
        System.out.println(s1);
        ReverseString reverse = new ReverseString();
        reverse.reverseString(s);
        System.out.println(s);

    }
}