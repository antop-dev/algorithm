package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P388Test {
    private final P388 sut = new P388();

    @Test
    void example01() {
        assertThat(
                sut.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"),
                is(20)
        );
    }

    @Test
    void example02() {
        assertThat(
                sut.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"),
                is(32)
        );
    }

    @Test
    void example03() {
        assertThat(
                sut.lengthLongestPath("a"),
                is(0)
        );
    }

}
