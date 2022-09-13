package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P300Test {
    private final P300 sut = new P300();

    @Test
    void example01() {
        assertThat(sut.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}), is(4));
    }

    @Test
    void example02() {
        assertThat(sut.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}), is(4));
    }

    @Test
    void example03() {
        assertThat(sut.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}), is(1));
    }

    @Test
    void example04() {
        assertThat(sut.lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}), is(6));
    }

}
