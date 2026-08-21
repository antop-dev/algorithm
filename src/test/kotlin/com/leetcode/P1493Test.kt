package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1493Test {
    val sut = P1493()

    @Test
    fun `example 01`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 1)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)), `is`(5))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1)), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.longestSubarray(intArrayOf(0)), `is`(0))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.longestSubarray(intArrayOf(1)), `is`(0))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 0)), `is`(0))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0)), `is`(1))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 1)), `is`(1))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1)), `is`(1))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 0, 0)), `is`(0))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0, 1)), `is`(2))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 0, 1, 1, 1)), `is`(3))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 0, 1, 1, 1)), `is`(6))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 1, 0, 1, 0, 1, 0)), `is`(2))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)), `is`(9))
    }

    @Test
    fun `example 16`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)), `is`(0))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1)), `is`(4))
    }

    @Test
    fun `example 18`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 1, 1, 1, 0, 1, 1)), `is`(5))
    }

    @Test
    fun `example 19`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 0, 1, 1, 1, 0, 0)), `is`(3))
    }

    @Test
    fun `example 20`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 1, 0)), `is`(4))
    }

    @Test
    fun `example 21`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 1, 1, 1, 1)), `is`(4))
    }

    @Test
    fun `example 22`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0, 0, 1, 1, 1, 1, 0, 0, 1)), `is`(4))
    }

    @Test
    fun `example 23`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1)), `is`(5))
    }

    @Test
    fun `example 24`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 1, 0)), `is`(1))
    }

    @Test
    fun `example 25`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0, 1, 1)), `is`(3))
    }

    @Test
    fun `example 26`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1)), `is`(10))
    }

    @Test
    fun `example 27`() {
        assertThat(sut.longestSubarray(intArrayOf(0, 0, 1, 0, 0)), `is`(1))
    }

    @Test
    fun `example 28`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 0, 1, 1)), `is`(2))
    }

    @Test
    fun `example 29`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 0, 1, 0, 1)), `is`(2))
    }

    @Test
    fun `example 30`() {
        assertThat(sut.longestSubarray(intArrayOf(1, 1, 0, 1, 1, 0, 1, 1)), `is`(4))
    }
}
