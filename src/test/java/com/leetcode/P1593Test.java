package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P1593Test {
    private final P1593 sut = new P1593();

    @Test
    void example01() {
        assertThat(sut.maxUniqueSplit("ababccc"), is(5));
    }

    @Test
    void example02() {
        assertThat(sut.maxUniqueSplit("aba"), is(2));
    }

    @Test
    void example03() {
        assertThat(sut.maxUniqueSplit("wwwzfvedwfvhsww"), is(11));
    }

}
