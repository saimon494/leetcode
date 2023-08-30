package com.leet.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class ReverseWords {
    /**
     * 557. Reverse Words in a String III
     * Given a string s, reverse the order of characters in each word
     *  within a sentence while still preserving whitespace and initial word order.
     */
    public static String reverseWords(String s) {
        // 5 ms 44.3 MB
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder s1 = new StringBuilder(arr[i]);
            str.append(s1.reverse() + " ");
        }

        return str.toString().trim();

        // 320 ms 45 MB
//        Stack<Character> stringStack = new Stack<>();
//        String newStr = "";
//        char ch = ' ';
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') {
//                stringStack.push(s.charAt(i));
//
//                if (i == s.length() - 1) {
//                    while (!stringStack.isEmpty()) {
//                        ch = stringStack.pop();
//                        newStr += ch;
//                    }
//                }
//            } else {
//                while (!stringStack.isEmpty()) {
//                    ch = stringStack.pop();
//                    newStr += ch;
//                }
//                ch = ' ';
//                newStr += ch;
//            }
//        }
//        return newStr;
    }

    public static void main(String[] args) {
        String s1 = "Let's take";
        System.out.println(s1 + " " + s1.length());
        String s2 = ReverseWords.reverseWords(s1);
        System.out.println(s2); // "s'teL ekat edoCteeL tsetnoc"
    }

}
