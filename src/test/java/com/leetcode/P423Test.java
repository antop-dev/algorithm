package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P423Test {
    private final P423 sut = new P423();

    @Test
    void example01() {
        assertThat(sut.findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1), is(1));
    }

    @Test
    void example02() {
        assertThat(sut.findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 3), is(2));
    }

    @Test
    void example03() {
        assertThat(sut.findLeastNumOfUniqueInts(new int[]{2, 1, 1, 3, 3, 3}, 3), is(1));
    }

    @Test
    void example04() {
        assertThat(sut.findLeastNumOfUniqueInts(new int[]{1}, 1), is(0));
    }

}
