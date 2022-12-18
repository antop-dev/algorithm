package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P921Test {
    private final P921 sut = new P921();

    @Test
    void example01() {
        assertThat(sut.minAddToMakeValid("())"), is(1));
    }

    @Test
    void example02() {
        assertThat(sut.minAddToMakeValid("((("), is(3));
    }

    @Test
    void example03() {
        assertThat(sut.minAddToMakeValid("()))(("), is(4));
    }

}
