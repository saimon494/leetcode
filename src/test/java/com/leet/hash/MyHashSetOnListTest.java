package com.leet.hash;

import org.junit.Assert;
import org.junit.Test;

public class MyHashSetOnListTest {

    @Test
    public void whenAddContains() {
        var hashSet = new MyHashSetOnList();
        hashSet.add(1);
        hashSet.add(2);
        Assert.assertTrue(hashSet.contains(1));
        Assert.assertFalse(hashSet.contains(3));
    }

    @Test
    public void whenAddRemoveContainsFalse() {
        var hashSet = new MyHashSetOnList();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        Assert.assertTrue(hashSet.contains(2));
    }

    @Test
    public void whenAddRemoveContainsTrue() {
        var hashSet = new MyHashSetOnList();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        Assert.assertFalse(hashSet.contains(1));
    }

    @Test
    public void whenAddRemoveContainsAdd() {
        var hashSet = new MyHashSetOnList();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        hashSet.add(1);
        Assert.assertTrue(hashSet.contains(1));
    }
}