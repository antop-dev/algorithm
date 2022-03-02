package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P146Test {

    @Test
    void example01() {
        P146 lRUCache = new P146(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        assertThat(lRUCache.get(1), is(1)); // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertThat(lRUCache.get(2), is(-1)); // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        assertThat(lRUCache.get(1), is(-1)); // return -1 (not found)
        assertThat(lRUCache.get(3), is(3)); // return 3
        assertThat(lRUCache.get(4), is(4)); // return 4
    }

}
