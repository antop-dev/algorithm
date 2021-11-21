package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P80Test {
    val p = P80()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        assertThat(p.removeDuplicates(nums), `is`(5))
        assertThat(nums[0], `is`(1))
        assertThat(nums[1], `is`(1))
        assertThat(nums[2], `is`(2))
        assertThat(nums[3], `is`(2))
        assertThat(nums[4], `is`(3))

    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        assertThat(p.removeDuplicates(nums), `is`(7))
        assertThat(nums[0], `is`(0))
        assertThat(nums[1], `is`(0))
        assertThat(nums[2], `is`(1))
        assertThat(nums[3], `is`(1))
        assertThat(nums[4], `is`(2))
        assertThat(nums[5], `is`(3))
        assertThat(nums[6], `is`(3))
    }

}
