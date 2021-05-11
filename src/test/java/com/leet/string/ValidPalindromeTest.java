package com.leet.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void whenPalindrome() {
        var vp = new ValidPalindrome();
        var s = "A man, a plan, a canal: Panama";
        assertTrue(vp.isPalindrome(s));
    }

    @Test
    public void whenNotPalindrome() {
        var vp = new ValidPalindrome();
        var s = "race a car";
        assertFalse(vp.isPalindrome(s));
    }

    @Test
    public void whenNotPalindrome2() {
        var vp = new ValidPalindrome();
        var s = "0P";
        assertFalse(vp.isPalindrome(s));
    }
}