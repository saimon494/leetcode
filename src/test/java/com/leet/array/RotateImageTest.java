package com.leet.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void whenRotate1() {
        var ri = new RotateImage();
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] exp = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        ri.rotate(nums);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenRotate2() {
        var ri = new RotateImage();
        int[][] nums = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] exp = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        ri.rotate(nums);
        assertArrayEquals(exp, nums);
    }

    @Test
    public void whenRotate3() {
        var ri = new RotateImage();
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] exp = {{3, 1}, {4, 2}};
        ri.rotate(nums);
        assertArrayEquals(exp, nums);
    }
}