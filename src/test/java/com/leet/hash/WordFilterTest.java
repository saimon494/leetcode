package com.leet.hash;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class WordFilterTest {

    @Test
    public void whenFilter1() {
        String[] words = {"apple", "box", "appple"};
        var wf = new WordFilter(words);
        assertThat(wf.f("a", "e"), is(2));
    }

    @Test
    public void whenFilter2() {
        String[] words = {"abcaccbcaa", "accabaccaa", "accabaccaa"};
        var wf = new WordFilter(words);
        assertThat((wf.f("a", "aa")), is(2));
    }

    @Test
    public void whenFilter3() {
        String[] words = {"a", "a", "a"};
        var wf = new WordFilter(words);
        assertThat(wf.f("a", "a"), is(2));
    }

}