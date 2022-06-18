package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P219Test {
    P219 sut = new P219();

    @Test
    void example01() {
        assertThat(sut.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3), is(true));
    }

    @Test
    void example02() {
        assertThat(sut.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1), is(true));
    }

    @Test
    void example03() {
        assertThat(sut.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2), is(false));
    }

    @Test
    void example04() {
        assertThat(sut.containsNearbyDuplicate(new int[]{99, 99}, 2), is(true));
    }

}
