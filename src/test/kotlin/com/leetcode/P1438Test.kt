package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1438Test {
    private val sut = P1438()

    @Test
    fun `example 01`() {
        assertThat(sut.longestSubarray(intArrayOf(8, 2, 4, 7), 4), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.longestSubarray(intArrayOf(10, 1, 2, 4, 7, 2), 5), `is`(4))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.longestSubarray(intArrayOf(4, 2, 2, 2, 4, 4, 2, 2), 0), `is`(3))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.longestSubarray(intArrayOf(1), 0), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.longestSubarray(intArrayOf(1), 1_000_000_000), `is`(1))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 1), 0), `is`(4))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 2, 3, 4, 5), 1), `is`(2))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 2, 3, 4, 5), 2), `is`(3))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 2, 3, 4, 5), 4), `is`(5))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.longestSubarray(intArrayOf(5, 4, 3, 2, 1), 0), `is`(1))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 5, 9), 3), `is`(1))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.longestSubarray(intArrayOf(1_000_000_000, 1), 999_999_999), `is`(2))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.longestSubarray(intArrayOf(1_000_000_000, 1), 999_999_998), `is`(1))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.longestSubarray(intArrayOf(2, 2, 2, 4, 4, 4), 2), `is`(6))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 3, 6, 10, 15), 5), `is`(3))
    }

    @Test
    fun `example 16`() {
        assertThat(sut.longestSubarray(intArrayOf(7, 7, 7, 7, 7, 7, 7, 7), 0), `is`(8))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 2, 1, 2, 1, 2), 1), `is`(6))
    }

    @Test
    fun `example 18`() {
        assertThat(sut.longestSubarray(intArrayOf(4, 8, 12, 16), 0), `is`(1))
    }

    @Test
    fun `example 19`() {
        assertThat(sut.longestSubarray(intArrayOf(9, 4, 7, 2, 10), 5), `is`(3))
    }

    @Test
    fun `example 20`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 5), `is`(10))
    }

    @Test
    fun `example 21`() {
        val nums = IntArray(100_000) { 1 }
        assertThat(sut.longestSubarray(nums, 0), `is`(100_000))
    }

    @Test
    fun `example 22`() {
        val nums = IntArray(100_000) { if (it % 2 == 0) 1 else 2 }
        assertThat(sut.longestSubarray(nums, 0), `is`(1))
    }

    @Test
    fun `example 23`() {
        assertThat(sut.longestSubarray(intArrayOf(3, 3, 3, 1, 3, 3, 3), 0), `is`(3))
    }

    @Test
    fun `example 24`() {
        assertThat(sut.longestSubarray(intArrayOf(100, 200, 300, 400), 100), `is`(2))
    }

    @Test
    fun `example 25`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 10, 1, 10, 1, 10), 9), `is`(6))
    }

    @Test
    fun `example 26`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 10, 1, 10, 1, 10), 8), `is`(1))
    }

    @Test
    fun `example 27`() {
        assertThat(sut.longestSubarray(intArrayOf(1_000_000_000), 0), `is`(1))
    }

    @Test
    fun `example 28`() {
        assertThat(sut.longestSubarray(intArrayOf(2, 1, 2, 1, 2, 1, 2), 0), `is`(1))
    }

    @Test
    fun `example 29`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 2, 4, 8, 16, 32), 30), `is`(5))
    }

    @Test
    fun `example 30`() {
        assertThat(sut.longestSubarray(intArrayOf(6, 5, 4, 3, 2, 1), 3), `is`(4))
    }
}
