package com.leet.hash;

// Design a special dictionary which has some words and
// allows you to search the words in it by a prefix and a suffix.
// WordFilter(string[] words) Initializes the object with the words in the dictionary.
// f(string prefix, string suffix) Returns the index of the word in the dictionary
// which has the prefix prefix and the suffix suffix.
// If there is more than one valid index, return the largest of them.
// If there is no such word in the dictionary, return -1.

import java.util.HashMap;

public class WordFilter {

    private HashMap<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
        for (int w = 0; w < words.length; w++) {
            for (int i = 0; i <= 10 && i <= words[w].length(); i++) {
                for (int j = 0; j <= 10 && j <= words[w].length(); j++) {
                    map.put(words[w].substring(0, i)
                            + "#" + words[w].substring(words[w].length() - j), w);
                }
            }
        }
    }

    public int f(String prefix, String suffix) {
        return (map.containsKey(prefix + "#" + suffix)) ? map.get(prefix + "#" + suffix) : -1;
    }

//    private Map<Integer, String> map;
//    public WordFilter(String[] words) {
//        map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            if (!map.containsValue(words[i])) {
//                map.put(i, words[i]);
//            }
//        }
//    }
//    public int f(String prefix, String suffix) {
//        int rsl = -1;
//        String word = "";
//        int maxLength = 0;
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            word = entry.getValue();
//            if (word.startsWith(prefix) && word.endsWith(suffix)) {
//                if (word.length() >= maxLength) {
//                    maxLength = word.length();
//                    rsl = entry.getKey();
//                }
//            }
//        }
//        return rsl;
//    }
}