package com.leet.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void whenValidAnagram() {
        var va = new ValidAnagram();
        var s = "anagram";
        var t = "nagaram";
        assertTrue(va.isAnagram(s, t));
    }

    @Test
    public void whenNotValidAnagram() {
        var va = new ValidAnagram();
        var s = "rat";
        var t = "car";
        assertFalse(va.isAnagram(s, t));
    }

    @Test
    public void whenNotValidAnagram2() {
        var va = new ValidAnagram();
        var s = "ac";
        var t = "bb";
        assertFalse(va.isAnagram(s, t));
    }
}