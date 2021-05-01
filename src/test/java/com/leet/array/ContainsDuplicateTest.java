package com.leet.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void whenContains() {
        var cd = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        assertTrue(cd.containsDuplicate(nums));
    }

    @Test
    public void whenNotContains() {
        var cd = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        assertFalse(cd.containsDuplicate(nums));
    }

    @Test
    public void whenContainsAgain() {
        var cd = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(cd.containsDuplicate(nums));
    }
}