package com.leet;

import com.leet.array.MaxConsecutiveOnes;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes max = new MaxConsecutiveOnes();

    @Test
    public void whenMax3() {
        int[] array = {1, 1, 0, 1, 1, 1};
        int rsl = max.findMaxConsecutiveOnes(array);
        Assert.assertThat(rsl, is(3));
    }

    @Test
    public void whenInput1() {
        int[] array = {1};
        int rsl = max.findMaxConsecutiveOnes(array);
        Assert.assertThat(rsl, is(1));
    }

    @Test
    public void whenInput0() {
        int[] array = {0};
        int rsl = max.findMaxConsecutiveOnes(array);
        Assert.assertThat(rsl, is(0));
    }
}