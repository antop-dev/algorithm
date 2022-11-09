package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P216Test {
    private final P216 sut = new P216();

    @Test
    void example01() {
        assertThat(sut.combinationSum3(3, 7), is(
                List.of(List.of(1, 2, 4))
        ));
    }

    @Test
    void example02() {
        assertThat(sut.combinationSum3(3, 9), is(
                List.of(
                        List.of(1, 2, 6),
                        List.of(1, 3, 5),
                        List.of(2, 3, 4)
                )
        ));
    }

    @Test
    void example03() {
        assertThat(sut.combinationSum3(2, 18), is(List.of()));
    }

}
