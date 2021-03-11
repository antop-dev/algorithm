package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P189Test {
    val p = P189()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        p.rotate(nums, 3)
        assertThat(nums, `is`(intArrayOf(5, 6, 7, 1, 2, 3, 4)))
    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(-1, -100, 3, 99)
        p.rotate(nums, 2)
        assertThat(nums, `is`(intArrayOf(3, 99, -1, -100)))
    }

    @Test
    fun `example 03`() {
        val nums = intArrayOf(1, 2)
        p.rotate(nums, 2)
        assertThat(nums, `is`(intArrayOf(1, 2)))
    }

    @Test
    fun `example 04`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        p.rotate(nums, 4)
        assertThat(nums, `is`(intArrayOf(3, 4, 5, 6, 1, 2)))
    }

    @Test
    fun `example 05`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        p.rotate(nums, 5)
        assertThat(nums, `is`(intArrayOf(2, 3, 4, 5, 6, 1)))
    }

    @Test
    fun `example 06`() {
        val nums = intArrayOf(
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15,
            16, 17, 18, 19, 20,
            21, 22, 23, 24, 25,
            26, 27
        )
        p.rotate(nums, 38)
        assertThat(
            nums, `is`(
                intArrayOf(
                    17, 18, 19, 20, 21,
                    22, 23, 24, 25, 26,
                    27, 1, 2, 3, 4,
                    5, 6, 7, 8, 9,
                    10, 11, 12, 13, 14,
                    15, 16
                )
            )
        )
    }

}
