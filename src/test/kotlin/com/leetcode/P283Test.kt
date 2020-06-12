package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P283Test {
    val p = P283()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(0, 1, 0, 3, 12);
        p.moveZeroes(nums)
        assertThat(nums, `is`(intArrayOf(1, 3, 12, 0, 0)))
    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(0, 5, 3, 0, 8);
        p.moveZeroes(nums)
        assertThat(nums, `is`(intArrayOf(5, 3, 8, 0, 0)))
    }

    @Test
    fun `example 03`() {
        val nums = intArrayOf(4, 12, 0, 5)
        p.moveZeroes(nums)
        assertThat(nums, `is`(intArrayOf(4, 12, 5, 0)))
    }
}
