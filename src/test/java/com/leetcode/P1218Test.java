package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P1218Test {
    private final P1218 sut = new P1218();

    @Test
    void example01() {
        assertThat(sut.longestSubsequence(new int[]{1, 2, 3, 4}, 1), is(4));
    }

    @Test
    void example02() {
        assertThat(sut.longestSubsequence(new int[]{1, 3, 5, 7}, 1), is(1));
    }

    @Test
    void example03() {
        assertThat(sut.longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2), is(4));
    }

    @Test
    void example04() {
        assertThat(sut.longestSubsequence(new int[]{3, 4, -3, -2, -4}, -5), is(2));
    }

}
