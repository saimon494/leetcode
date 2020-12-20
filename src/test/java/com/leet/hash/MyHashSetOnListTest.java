package com.leet.hash;

import org.junit.Assert;
import org.junit.Test;

public class MyHashSetOnListTest {
    MyHashSetOnList hashSet = new MyHashSetOnList();

    @Test
    public void whenAddContains() {
        hashSet.add(1);
        hashSet.add(2);
        Assert.assertTrue(hashSet.contains(1));
        Assert.assertFalse(hashSet.contains(3));
    }

    @Test
    public void whenAddRemoveContainsFalse() {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        Assert.assertTrue(hashSet.contains(2));
    }

    @Test
    public void whenAddRemoveContainsTrue() {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        Assert.assertFalse(hashSet.contains(1));
    }

    @Test
    public void whenAddRemoveContainsAdd() {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        hashSet.add(1);
        Assert.assertTrue(hashSet.contains(1));
    }
}