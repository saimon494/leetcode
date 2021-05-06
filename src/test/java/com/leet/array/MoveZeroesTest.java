package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void whenMoveZeroes1() {
        var mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        int[] exp = {1, 3, 12, 0, 0};
        mz.moveZeroes(nums);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenMoveZeroes2() {
        var mz = new MoveZeroes();
        int[] nums = {0};
        int[] exp = {0};
        mz.moveZeroes(nums);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenMoveZeroes3() {
        var mz = new MoveZeroes();
        int[] nums = {1, 0, 45, 3, 0, 8, 0, 6};
        int[] exp = {1, 45, 3, 8, 6, 0, 0, 0};
        mz.moveZeroes(nums);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenMoveZeroes4() {
        var mz = new MoveZeroes();
        int[] nums = {1, 2, 3, 1};
        int[] exp = {1, 2, 3, 1};
        mz.moveZeroes(nums);
        assertArrayEquals(exp, nums);
    }
}