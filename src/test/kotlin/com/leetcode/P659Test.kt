package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P659Test {
    val p = P659()

    @Test
    fun `example 01`() {
        // 1,2,3
        // 3,4,5
        assertThat(p.isPossible(intArrayOf(1, 2, 3, 3, 4, 5)), `is`(true))
    }

    @Test
    fun `example 02`() {
        // 1,2,3,4,5
        // 3,4,5
        assertThat(p.isPossible(intArrayOf(1, 2, 3, 3, 4, 4, 5, 5)), `is`(true))
    }

    @Test
    fun `example 03`() {
        // 1,2,3,4
        // 4,5
        assertThat(p.isPossible(intArrayOf(1, 2, 3, 4, 4, 5)), `is`(false))
    }
}
