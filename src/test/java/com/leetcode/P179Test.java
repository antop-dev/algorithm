package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P179Test {
    private final P179 sut = new P179();

    @Test
    void example01() {
        assertThat(sut.largestNumber(new int[]{10, 2}), is("210"));
    }

    @Test
    void example02() {
        assertThat(sut.largestNumber(new int[]{3, 30, 34, 5, 9}), is("9534330"));
    }

    @Test
    void example03() {
        assertThat(sut.largestNumber(new int[]{1, 31}), is("311"));
    }

    @Test
    void example04() {
        assertThat(sut.largestNumber(new int[]{34323, 3432}), is("343234323"));
    }

    @Test
    void example05() {
        assertThat(sut.largestNumber(new int[]{0, 0}), is("0"));
    }

}
