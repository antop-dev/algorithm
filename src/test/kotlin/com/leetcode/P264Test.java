package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P264Test {
    private final P264 p = new P264();

    @DisplayName("example 01")
    @Test
    void example01() {
        assertThat(p.nthUglyNumber(10), is(12));
    }

    @DisplayName("example 02")
    @Test
    void example02() {
        assertThat(p.nthUglyNumber(1), is(1));
    }

    @DisplayName("example 03")
    @Test
    void example03() {
        assertThat(p.nthUglyNumber(1690), is(2123366400));
    }

}
