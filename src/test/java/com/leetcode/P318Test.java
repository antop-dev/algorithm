package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P318Test {
    private P318 sut = new P318();

    @Test
    void example01() {
        assertThat(sut.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}), is(16));
    }

    @Test
    void example02() {
        assertThat(sut.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}), is(4));
    }

    @Test
    void example03() {
        assertThat(sut.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}), is(0));
    }

}
