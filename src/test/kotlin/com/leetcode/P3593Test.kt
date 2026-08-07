package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3593Test {
    private val sut = P3593()

    @Test
    fun `example 01`() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))
        val cost = intArrayOf(2, 1, 3)
        assertThat(sut.minIncrease(n, edges, cost), `is`(1))
    }

    @Test
    fun `example 02`() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val cost = intArrayOf(5, 1, 4)
        assertThat(sut.minIncrease(n, edges, cost), `is`(0))
    }

    @Test
    fun `example 03`() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 4), intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3))
        val cost = intArrayOf(3, 4, 1, 1, 7)
        assertThat(sut.minIncrease(n, edges, cost), `is`(1))
    }

    @Test
    fun `example 04`() {
        val n = 4
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3))
        val cost = intArrayOf(1, 2, 2, 5)
        assertThat(sut.minIncrease(n, edges, cost), `is`(2))
    }

    @Test
    fun `example 05`() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1), intArrayOf(0, 2),
            intArrayOf(1, 3), intArrayOf(1, 4),
            intArrayOf(2, 5), intArrayOf(2, 6),
        )
        val cost = intArrayOf(1, 1, 1, 2, 2, 3, 3)
        assertThat(sut.minIncrease(n, edges, cost), `is`(1))
    }

    @Test
    fun `example 06`() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1), intArrayOf(0, 2),
            intArrayOf(1, 3), intArrayOf(1, 4),
            intArrayOf(2, 5), intArrayOf(2, 6),
        )
        val cost = intArrayOf(1, 1, 1, 2, 5, 3, 3)
        assertThat(sut.minIncrease(n, edges, cost), `is`(2))
    }

    @Test
    fun `example 07`() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1), intArrayOf(0, 2),
            intArrayOf(1, 3), intArrayOf(1, 4),
            intArrayOf(2, 5), intArrayOf(2, 6),
        )
        val cost = intArrayOf(10, 1, 1, 5, 5, 5, 5)
        assertThat(sut.minIncrease(n, edges, cost), `is`(0))
    }

    @Test
    fun `example 08`() {
        val n = 6
        val edges = arrayOf(
            intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3),
            intArrayOf(3, 4), intArrayOf(3, 5),
        )
        val cost = intArrayOf(2, 3, 3, 1, 4, 4)
        assertThat(sut.minIncrease(n, edges, cost), `is`(2))
    }

    @Test
    fun `example 09`() {
        val n = 4
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))
        val cost = intArrayOf(10, 20, 30, 40)
        assertThat(sut.minIncrease(n, edges, cost), `is`(0))
    }

    @Test
    fun `example 10`() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4))
        val cost = intArrayOf(1, 2, 2, 2, 5)
        assertThat(sut.minIncrease(n, edges, cost), `is`(3))
    }

    @Test
    fun `example 11`() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4))
        val cost = intArrayOf(1, 2, 2, 5, 5)
        assertThat(sut.minIncrease(n, edges, cost), `is`(2))
    }

    @Test
    fun `example 12`() {
        val n = 6
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4), intArrayOf(0, 5))
        val cost = intArrayOf(1, 2, 2, 5, 5, 4)
        assertThat(sut.minIncrease(n, edges, cost), `is`(3))
    }

    @Test
    fun `example 13`() {
        val n = 3
        val edges = arrayOf(intArrayOf(1, 0), intArrayOf(0, 2))
        val cost = intArrayOf(2, 1, 3)
        assertThat(sut.minIncrease(n, edges, cost), `is`(1))
    }

    @Test
    fun `example 14`() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 4), intArrayOf(0, 3), intArrayOf(3, 2), intArrayOf(3, 1))
        val cost = intArrayOf(3, 4, 1, 1, 7)
        assertThat(sut.minIncrease(n, edges, cost), `is`(2))
    }
}
