package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P347Test {
    val p = P347()

    @Test
    fun `example 01`() {
        assertThat(
            p.topKFrequent(nums = intArrayOf(1, 1, 1, 2, 2, 3), k = 2),
            `is`(intArrayOf(1, 2))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.topKFrequent(nums = intArrayOf(1), k = 1),
            `is`(intArrayOf(1))
        )
    }
}
