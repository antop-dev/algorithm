package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P645Test {
    private final P645 sut = new P645();

    @Test
    void example01() {
        assertThat(sut.findErrorNums(new int[]{1, 2, 2, 4}), is(new int[]{2, 3}));
    }

    @Test
    void example02() {
        assertThat(sut.findErrorNums(new int[]{1, 1}), is(new int[]{1, 2}));
    }

    @Test
    void example03() {
        assertThat(sut.findErrorNums(new int[]{2, 2}), is(new int[]{2, 1}));
    }

    @Test
    void example04() {
        assertThat(sut.findErrorNums(new int[]{3, 2, 2}), is(new int[]{2, 1}));
    }

    @Test
    void example05() {
        assertThat(sut.findErrorNums(new int[]{3, 2, 3, 4, 6, 5}), is(new int[]{3, 1}));
    }

}
