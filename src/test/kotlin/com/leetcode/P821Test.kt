package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P821Test {
    val p = P821()

    @Test
    fun `example 01`() {
        assertThat(
            p.shortestToChar("loveleetcode", 'e'),
            `is`(intArrayOf(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0))
        )
    }
}
