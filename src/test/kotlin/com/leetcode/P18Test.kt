package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P18Test {
    val p = P18()

    @Test
    fun `example 01`() {
        assertThat(
            p.fourSum(nums = intArrayOf(1, 0, -1, 0, -2, 2), target = 0),
            containsInAnyOrder(
                `is`(listOf(-2, -1, 1, 2)),
                `is`(listOf(-2, 0, 0, 2)),
                `is`(listOf(-1, 0, 0, 1))
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.fourSum(nums = intArrayOf(2, 2, 2, 2, 2), target = 8),
            `is`(listOf(listOf(2, 2, 2, 2)))
        )
    }
}
