package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P215Test {
    val p = P215()

    @Test
    fun `example 01`() {
        assertThat(
            p.findKthLargest(nums = intArrayOf(3, 2, 1, 5, 6, 4), k = 2),
            `is`(5)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.findKthLargest(nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), k = 4),
            `is`(4)
        )
    }
}
