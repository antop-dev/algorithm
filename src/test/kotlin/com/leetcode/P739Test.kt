package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P739Test {
    val p = P739()

    @Test
    fun `example 01`() {
        assertThat(
            p.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)),
            `is`(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.dailyTemperatures(intArrayOf(89, 62, 70, 58, 47, 47, 46, 76, 100, 70)),
            `is`(intArrayOf(8, 1, 5, 4, 3, 2, 1, 1, 0, 0))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.dailyTemperatures(intArrayOf(55, 38, 53, 81, 61, 93, 97, 32, 43, 78)),
            `is`(intArrayOf(3, 1, 1, 2, 1, 1, 0, 1, 1, 0))
        )
    }

}
