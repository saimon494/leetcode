package com.leet.hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSetOnList {
    private final int maxValue = 1000000;
    private final int arraySize = 100;
    private List<List<Integer>> parentList;

    public MyHashSetOnList() {
        parentList = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            parentList.add(null);
        }
    }

    public void add(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        if (childList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        } else {
            if (!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        if (childList != null) {
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }
}
