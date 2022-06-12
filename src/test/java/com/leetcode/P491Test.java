package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class P491Test {
    private final P491 p = new P491();

    @Test
    void example01() {
        assertThat(
                p.findSubsequences(new int[]{4, 6, 7, 7}),
                containsInAnyOrder(
                        Arrays.asList(4, 6),
                        Arrays.asList(4, 6, 7),
                        Arrays.asList(4, 6, 7, 7),
                        Arrays.asList(4, 7),
                        Arrays.asList(4, 7, 7),
                        Arrays.asList(6, 7),
                        Arrays.asList(6, 7, 7),
                        Arrays.asList(7, 7)
                )
        );
    }

    @Test
    void example02() {
        assertThat(
                p.findSubsequences(new int[]{4, 4, 3, 2, 1}),
                containsInAnyOrder(Arrays.asList(4, 4))
        );
    }

}
