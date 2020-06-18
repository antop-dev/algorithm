package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1004Test {
    val p = P1004()

    @Test
    fun `example 01`() {
        assertThat(p.longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestOnes(intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1), 3), `is`(10))
    }

    @Test
    fun `example 03`() {
        assertThat(p.longestOnes(intArrayOf(0, 0, 0, 1), 4), `is`(4))
    }
}
