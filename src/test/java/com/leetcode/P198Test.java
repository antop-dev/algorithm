package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P198Test {
    private final P198 p = new P198();

    @Test
    void example01() {
        assertThat(p.rob(new int[]{1, 2, 3, 1}), is(4));
    }

    @Test
    void example02() {
        assertThat(p.rob(new int[]{2, 7, 9, 3, 1}), is(12));
    }

    @Test
    void example03() {
        assertThat(p.rob(new int[]{1, 2, 3, 100}), is(102));
    }

    @Test
    void example04() {
        assertThat(p.rob(new int[]{7, 1, 1, 10}), is(17));
    }

}
