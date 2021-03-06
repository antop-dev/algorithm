package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P500Test {
    private final P500 p = new P500();

    @Test
    void example01() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] answer = {"Alaska", "Dad"};
        assertThat(p.findWords(words), is(answer));
    }

    @Test
    void example02() {
        String[] words = {"omk"};
        String[] answer = {};
        assertThat(p.findWords(words), is(answer));
    }
}
