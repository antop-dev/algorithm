package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P445Test {
    private final P445 p = new P445();

    @DisplayName("example 01")
    @Test
    void example01() {
        assertThat(p.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}), is(1));
    }

    @DisplayName("example 02")
    @Test
    void example02() {
        assertThat(p.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}), is(2));
    }

    @DisplayName("example 03")
    @Test
    void example03() {
        assertThat(p.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}), is(2));
    }

}
