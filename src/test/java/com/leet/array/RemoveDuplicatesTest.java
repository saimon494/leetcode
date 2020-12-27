package com.leet.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void whenRemove1() {
        int[] array = {1,1,2};
        int rsl = removeDuplicates.removeDuplicates(array);
        Assert.assertThat(rsl, is(2));
    }

    @Test
    public void whenRemove5() {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        int rsl = removeDuplicates.removeDuplicates(array);
        Assert.assertThat(rsl, is(5));
    }
}