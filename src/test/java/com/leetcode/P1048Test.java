package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-string-chain/
 */
class P1048Test {
    private P1048 p = new P1048();

    @Test
    void example01() {
        assertEquals(4, p.longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"}));
    }

    @Test
    void example02() {
        assertEquals(3, p.longestStrChain(new String[]{"a", "b", "ba", "bac", "bad"}));
    }

    @Test
    void example03() {
        assertEquals(7, p.longestStrChain(new String[]{
                "ksqvsyq", "ks", "kss", "czvh", "zczpzvdhx",
                "zczpzvh", "zczpzvhx", "zcpzvh", "zczvh", "gr",
                "grukmj", "ksqvsq", "gruj", "kssq", "ksqsq",
                "grukkmj", "grukj", "zczpzfvdhx", "gru"
        }));
    }

}