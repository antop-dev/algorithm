package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P706Test {

    @Test
    fun example() {
        val map = P706()

        map.put(1, 1)
        map.put(2, 2)
        assertThat("returns 1", map.get(1), `is`(1))
        assertThat("returns -1 (not found)", map.get(3), `is`(-1))
        map.put(2, 1) // update the existing value
        assertThat("returns 1", map.get(2), `is`(1))
        map.remove(2) // remove the mapping for 2
        assertThat("returns -1 (not found)", map.get(2), `is`(-1))
    }
}
