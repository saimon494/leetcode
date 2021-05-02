package com.leet.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void whenSingleVar1() {
        var sn = new SingleNumber();
        int[] nums = {2, 2, 1};
        assertThat(sn.singleNumber(nums), is(1));
    }

    @Test
    public void whenSingleVar2() {
        var sn = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        assertThat(sn.singleNumber(nums), is(4));
    }

    @Test
    public void whenSingleVar3() {
        var sn = new SingleNumber();
        int[] nums = {1};
        assertThat(sn.singleNumber(nums), is(1));
    }
}