package com.leet.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DegreeArrayTest {

    @Test
    public void whenDegreeArray1() {
        var degreeArray = new DegreeArray();
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 2, 4};
        int rsl = degreeArray.findShortestSubArray(arr);
        assertThat(rsl, is(6));
    }

    @Test
    public void whenDegreeArray2() {
        var degreeArray = new DegreeArray();
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        int rsl = degreeArray.findShortestSubArray(arr);
        assertThat(rsl, is(6));
    }

    @Test
    public void whenDegreeArray3() {
        var degreeArray = new DegreeArray();
        int[] arr = {1, 2, 2, 3};
        int rsl = degreeArray.findShortestSubArray(arr);
        assertThat(rsl, is(2));
    }
}