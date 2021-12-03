package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P718Test {
    val p = P718()

    @Test
    fun `example 01`() {
        assertThat(
            p.findLength(intArrayOf(1, 2, 3, 2, 1), intArrayOf(3, 2, 1, 4, 7)),
            `is`(3)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.findLength(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0)),
            `is`(5)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.findLength(intArrayOf(0, 1, 1, 1, 1), intArrayOf(1, 0, 1, 0, 1)),
            `is`(2)
        )
    }
}
