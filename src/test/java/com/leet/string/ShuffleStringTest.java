package com.leet.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShuffleStringTest {

    @Test
    public void whenShuffleString1() {
        var ss = new ShuffleString();
        var s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        var rsl = ss.restoreString(s, indices);
        assertThat(rsl, is("leetcode"));
    }

    @Test
    public void whenShuffleString2() {
        var ss = new ShuffleString();
        var s = "abc";
        int[] indices = {0, 1, 2};
        var rsl = ss.restoreString(s, indices);
        assertThat(rsl, is("abc"));
    }

    @Test
    public void whenShuffleString3() {
        var ss = new ShuffleString();
        var s = "aiohn";
        int[] indices = {3, 1, 4, 2, 0};
        var rsl = ss.restoreString(s, indices);
        assertThat(rsl, is("nihao"));
    }

    @Test
    public void whenShuffleString4() {
        var ss = new ShuffleString();
        var s = "aaiougrt";
        int[] indices = {4, 0, 2, 6, 7, 3, 1, 5};
        var rsl = ss.restoreString(s, indices);
        assertThat(rsl, is("arigatou"));
    }

    @Test
    public void whenShuffleString5() {
        var ss = new ShuffleString();
        var s = "art";
        int[] indices = {1, 0, 2};
        var rsl = ss.restoreString(s, indices);
        assertThat(rsl, is("rat"));
    }
}