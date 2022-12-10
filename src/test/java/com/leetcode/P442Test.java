package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

class P442Test {
    private final P442 sut = new P442();

    @Test
    void example01() {
        assertThat(sut.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}), containsInAnyOrder(2, 3));
    }

    @Test
    void example02() {
        assertThat(sut.findDuplicates(new int[]{1, 1, 2}), containsInAnyOrder(1));
    }

    @Test
    void example03() {
        assertThat(sut.findDuplicates(new int[]{1}), empty());
    }

}
