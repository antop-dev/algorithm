package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P739Test {
    val p = P739()

    @Test
    fun `example 01`() {
        val T = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
        assertThat(p.dailyTemperatures(T), `is`(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)))
    }
}
