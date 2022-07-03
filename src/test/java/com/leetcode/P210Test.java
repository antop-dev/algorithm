package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

class P210Test {
    private final P210 p = new P210();

    @DisplayName("example 01")
    @Test
    void example01() {
        assertThat(
                p.findOrder(2, new int[][]{{1, 0}}),
                is(new int[]{0, 1})
        );
    }

    @DisplayName("example 02")
    @Test
    void example02() {
        assertThat(
                p.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}),
                anyOf(
                        is(new int[]{0, 2, 1, 3}),
                        is(new int[]{0, 1, 2, 3})
                )
        );
    }

    @DisplayName("example 03")
    @Test
    void example03() {
        assertThat(
                p.findOrder(1, new int[][]{}),
                is(new int[]{0})
        );
    }

    @DisplayName("example 04")
    @Test
    void example04() {
        assertThat(
                p.findOrder(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}),
                is(new int[]{2, 1, 0})
        );
    }

}
