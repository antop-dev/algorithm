package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P974Test {
    private final P974 p = new P974();

    @Test
    void example01() {
        int[] nums = new int[]{4, 5, 0, -2, -3, 1};
        int k = 5;
        assertThat(p.subarraysDivByK(nums, k), is(7));
    }

    @Test
    void example02() {
        int[] nums = new int[]{5};
        int k = 9;
        assertThat(p.subarraysDivByK(nums, k), is(0));
    }

}
