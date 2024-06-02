package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P189Test {
    val sut = P189()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sut.rotate(nums, 3)
        assertThat(nums, `is`(intArrayOf(5, 6, 7, 1, 2, 3, 4)))
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(-1, -100, 3, 99)
        sut.rotate(nums, 2)
        assertThat(nums, `is`(intArrayOf(3, 99, -1, -100)))
    }

    @Test
    fun `example 3`() {
        val nums = intArrayOf(1, 2)
        sut.rotate(nums, 2)
        assertThat(nums, `is`(intArrayOf(1, 2)))
    }

    @Test
    fun `example 4`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        sut.rotate(nums, 4)
        assertThat(nums, `is`(intArrayOf(3, 4, 5, 6, 1, 2)))
    }

    @Test
    fun `example 5`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        sut.rotate(nums, 5)
        assertThat(nums, `is`(intArrayOf(2, 3, 4, 5, 6, 1)))
    }

    @Test
    fun `example 6`() {
        val nums = intArrayOf(
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15,
            16, 17, 18, 19, 20,
            21, 22, 23, 24, 25,
            26, 27
        )
        sut.rotate(nums, 38)
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
