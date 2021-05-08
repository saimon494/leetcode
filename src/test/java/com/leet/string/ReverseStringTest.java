package com.leet.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void whenReverse1() {
        var rs = new ReverseString();
        var s = new char[]{'h', 'e', 'l', 'l', 'o'};
        rs.reverseString(s);
        var exp = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(exp, s);
    }

    @Test
    public void whenReverse2() {
        var rs = new ReverseString();
        var s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        rs.reverseString(s);
        var exp = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        assertArrayEquals(exp, s);
    }

    @Test
    public void whenReverse3() {
        var rs = new ReverseString();
        var s = new char[]{'H', 'a'};
        rs.reverseString(s);
        var exp = new char[]{'a', 'H'};
        assertArrayEquals(exp, s);
    }

    @Test
    public void whenReverse4() {
        var rs = new ReverseString();
        var s = new char[]{'n', 'a', 'h'};
        rs.reverseString(s);
        var exp = new char[]{'h', 'a', 'n'};
        assertArrayEquals(exp, s);
    }
}