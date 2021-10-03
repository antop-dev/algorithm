package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P75Test {
    val p = P75()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)
        p.sortColors(nums)
        assertThat(nums, `is`(intArrayOf(0, 0, 1, 1, 2, 2)))
    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(2, 0, 1)
        p.sortColors(nums)
        assertThat(nums, `is`(intArrayOf(0, 1, 2)))
    }

    @Test
    fun `example 03`() {
        val nums = intArrayOf(0)
        p.sortColors(nums)
        assertThat(nums, `is`(intArrayOf(0)))
    }

    @Test
    fun `example 04`() {
        val nums = intArrayOf(1)
        p.sortColors(nums)
        assertThat(nums, `is`(intArrayOf(1)))
    }

}
