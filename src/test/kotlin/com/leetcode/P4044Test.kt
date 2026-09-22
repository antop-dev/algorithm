package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P4044Test {
    private val sut = P4044()

    @Test
    fun `example 01`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6)
        assertThat(sut.countGoodRotations(nums), `is`(3))
    }

    @Test
    fun `example 02`() {
        val nums = intArrayOf(1, 2, 1, 2)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    // n이 최소(2)인 경우
    @Test
    fun `example 03`() {
        val nums = intArrayOf(1, 2)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 04`() {
        val nums = intArrayOf(2, 1)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 05`() {
        val nums = intArrayOf(7, 7)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    // nums[i]가 최소(1)인 경우
    @Test
    fun `example 06`() {
        val nums = intArrayOf(1, 1)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 07`() {
        val nums = intArrayOf(5, 5, 5, 5)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 08`() {
        val nums = intArrayOf(100, 1, 1, 1)
        assertThat(sut.countGoodRotations(nums), `is`(2))
    }

    // nums[i]가 최대(1,000,000,000)인 경우
    @Test
    fun `example 09`() {
        val nums = intArrayOf(1000000000, 1)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 10`() {
        val nums = intArrayOf(1, 1000000000)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 11`() {
        val nums = intArrayOf(1000000000, 1000000000)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 12`() {
        val nums = intArrayOf(4, 3, 2, 1)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 13`() {
        val nums = intArrayOf(1, 3, 2, 4)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 14`() {
        val nums = intArrayOf(6, 5, 4, 3, 2, 1)
        assertThat(sut.countGoodRotations(nums), `is`(3))
    }

    @Test
    fun `example 15`() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 16`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        assertThat(sut.countGoodRotations(nums), `is`(3))
    }

    @Test
    fun `example 17`() {
        val nums = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6)
        assertThat(sut.countGoodRotations(nums), `is`(4))
    }

    @Test
    fun `example 18`() {
        val nums = intArrayOf(2, 2, 2, 2, 2, 2)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    // 값이 주기적으로 반복되는 경우
    @Test
    fun `example 19`() {
        val nums = intArrayOf(1, 2, 3, 1, 2, 3)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 20`() {
        val nums = intArrayOf(10, 20, 10, 20, 10, 20)
        assertThat(sut.countGoodRotations(nums), `is`(3))
    }

    @Test
    fun `example 21`() {
        val nums = intArrayOf(9, 1, 1, 9)
        assertThat(sut.countGoodRotations(nums), `is`(1))
    }

    @Test
    fun `example 22`() {
        val nums = intArrayOf(1, 9, 1, 9)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 23`() {
        val nums = intArrayOf(5, 1, 5, 1, 5, 1)
        assertThat(sut.countGoodRotations(nums), `is`(3))
    }

    @Test
    fun `example 24`() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertThat(sut.countGoodRotations(nums), `is`(5))
    }

    @Test
    fun `example 25`() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 2)
        assertThat(sut.countGoodRotations(nums), `is`(4))
    }

    @Test
    fun `example 26`() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 27`() {
        val nums = intArrayOf(1000000000, 1, 1000000000, 1)
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 28`() {
        val nums = intArrayOf(1000000000, 1, 1, 1)
        assertThat(sut.countGoodRotations(nums), `is`(2))
    }

    // n이 최대(100,000)인 경우
    @Test
    fun `example 29`() {
        val nums = IntArray(100000) { 1 }
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }

    @Test
    fun `example 30`() {
        val nums = IntArray(100000) { if (it % 2 == 0) 10 else 20 }
        assertThat(sut.countGoodRotations(nums), `is`(0))
    }
}
