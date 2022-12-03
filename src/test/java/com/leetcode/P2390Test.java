package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P2390Test {
    private P2390 sut = new P2390();

    @Test
    void example01() {
        assertThat(sut.removeStars("leet**cod*e"), is("lecoe"));
    }

    @Test
    void example02() {
        assertThat(sut.removeStars("erase*****"), is(""));
    }


}
