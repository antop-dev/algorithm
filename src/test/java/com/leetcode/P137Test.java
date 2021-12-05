package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P137Test {
    private final P137 p = new P137();

    @Test
    void example01() {
        assertThat(p.singleNumber(new int[]{2, 2, 3, 2}), is(3));
    }

    @Test
    void example02() {
        assertThat(p.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}), is(99));
    }

    @Test
    void example03() {
        assertThat(p.singleNumber(new int[]{0, 1, 1, 1}), is(0));
    }

}
