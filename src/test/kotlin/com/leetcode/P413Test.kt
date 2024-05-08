package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P413Test {
    val sut = P413()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(3))
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(1)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(0))
    }

    @Test
    fun `example 3`() {
        val nums = intArrayOf(7, 7, 7, 7)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(3))
    }

    @Test
    fun `example 4`() {
        val nums = intArrayOf(3, -1, -5, -9)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(3))
    }

    @Test
    fun `example 5`() {
        val nums = intArrayOf(1, 2, 3, 4, 7, 9, 11)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(4))
    }

    @Test
    fun `example 6`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(6))
    }

    @Test
    fun `example 7`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        assertThat(sut.numberOfArithmeticSlices(nums), `is`(10))
    }

}
