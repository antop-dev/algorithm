package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2673Test {
    private val sut = P2673()

    @Test
    fun `example 01`() {
        val n = 7
        val cost = intArrayOf(1, 5, 2, 2, 3, 3, 1)
        assertThat(sut.minIncrements(n, cost), `is`(6))
    }

    @Test
    fun `example 02`() {
        val n = 3
        val cost = intArrayOf(5, 3, 3)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    // n이 최소(3)이고 cost가 최소(1)인 경우
    @Test
    fun `example 03`() {
        val n = 3
        val cost = intArrayOf(1, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 04`() {
        val n = 3
        val cost = intArrayOf(1, 1, 10000)
        assertThat(sut.minIncrements(n, cost), `is`(9999))
    }

    @Test
    fun `example 05`() {
        val n = 3
        val cost = intArrayOf(10000, 1, 10000)
        assertThat(sut.minIncrements(n, cost), `is`(9999))
    }

    @Test
    fun `example 06`() {
        val n = 3
        val cost = intArrayOf(1, 2, 3)
        assertThat(sut.minIncrements(n, cost), `is`(1))
    }

    @Test
    fun `example 07`() {
        val n = 3
        val cost = intArrayOf(3, 2, 1)
        assertThat(sut.minIncrements(n, cost), `is`(1))
    }

    @Test
    fun `example 08`() {
        val n = 7
        val cost = intArrayOf(7, 7, 7, 7, 7, 7, 7)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 09`() {
        val n = 7
        val cost = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        assertThat(sut.minIncrements(n, cost), `is`(5))
    }

    @Test
    fun `example 10`() {
        val n = 7
        val cost = intArrayOf(7, 6, 5, 4, 4, 3, 2)
        assertThat(sut.minIncrements(n, cost), `is`(3))
    }

    @Test
    fun `example 11`() {
        val n = 7
        val cost = intArrayOf(1, 1, 1, 1, 1, 1, 10)
        assertThat(sut.minIncrements(n, cost), `is`(18))
    }

    @Test
    fun `example 12`() {
        val n = 7
        val cost = intArrayOf(1, 10, 1, 1, 1, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(9))
    }

    @Test
    fun `example 13`() {
        val n = 7
        val cost = intArrayOf(1, 2, 2, 3, 3, 3, 3)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 14`() {
        val n = 7
        val cost = intArrayOf(5, 1, 1, 1, 2, 3, 4)
        assertThat(sut.minIncrements(n, cost), `is`(4))
    }

    @Test
    fun `example 15`() {
        val n = 7
        val cost = intArrayOf(1, 1, 2, 3, 3, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(1))
    }

    @Test
    fun `example 16`() {
        val n = 7
        val cost = intArrayOf(4, 2, 8, 1, 1, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(6))
    }

    @Test
    fun `example 17`() {
        val n = 7
        val cost = intArrayOf(1, 10000, 1, 1, 1, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(9999))
    }

    @Test
    fun `example 18`() {
        val n = 7
        val cost = intArrayOf(1, 1, 10000, 10000, 1, 1, 10000)
        assertThat(sut.minIncrements(n, cost), `is`(29997))
    }

    @Test
    fun `example 19`() {
        val n = 15
        val cost = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 20`() {
        val n = 15
        val cost = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        assertThat(sut.minIncrements(n, cost), `is`(17))
    }

    @Test
    fun `example 21`() {
        val n = 15
        val cost = intArrayOf(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        assertThat(sut.minIncrements(n, cost), `is`(17))
    }

    @Test
    fun `example 22`() {
        val n = 15
        val cost = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10000)
        assertThat(sut.minIncrements(n, cost), `is`(29997))
    }

    @Test
    fun `example 23`() {
        val n = 15
        val cost = intArrayOf(10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000)
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 24`() {
        val n = 15
        val cost = intArrayOf(2, 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7)
        assertThat(sut.minIncrements(n, cost), `is`(26))
    }

    @Test
    fun `example 25`() {
        val n = 31
        val cost = IntArray(31) { it + 1 }
        assertThat(sut.minIncrements(n, cost), `is`(49))
    }

    @Test
    fun `example 26`() {
        val n = 1023
        val cost = IntArray(1023) { it % 7 + 1 }
        assertThat(sut.minIncrements(n, cost), `is`(1607))
    }

    // n이 최대(65535)인 경우
    @Test
    fun `example 27`() {
        val n = 65535
        val cost = IntArray(65535) { 1 }
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }

    @Test
    fun `example 28`() {
        val n = 65535
        val cost = IntArray(65535) { it + 1 }
        assertThat(sut.minIncrements(n, cost), `is`(458753))
    }

    @Test
    fun `example 29`() {
        val n = 65535
        val cost = IntArray(65535) { if (it % 2 == 1) 10000 else 1 }
        assertThat(sut.minIncrements(n, cost), `is`(327637233))
    }

    @Test
    fun `example 30`() {
        val n = 65535
        val cost = IntArray(65535) { 10000 }
        assertThat(sut.minIncrements(n, cost), `is`(0))
    }
}
