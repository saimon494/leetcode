package com.leet.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueCharTest {

    @Test
    public void whenUniqueChar1() {
        var uc = new UniqueChar();
        var s = "leetcode";
        int rsl = uc.firstUniqChar(s);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenUniqueChar2() {
        var uc = new UniqueChar();
        var s = "loveleetcode";
        int rsl = uc.firstUniqChar(s);
        assertThat(rsl, is(2));
    }

    @Test
    public void whenUniqueChar3() {
        var uc = new UniqueChar();
        var s = "aabb";
        int rsl = uc.firstUniqChar(s);
        assertThat(rsl, is(-1));
    }
}