package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2225Test {
    val sut = P2225()

    @Test
    fun `example 01`() {
        val matches = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(10, 4),
            intArrayOf(10, 9)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1, 2, 10), listOf(4, 5, 7, 8))))
    }

    @Test
    fun `example 02`() {
        val matches = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(5, 4),
            intArrayOf(6, 4)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1, 2, 5, 6), listOf())))
    }

    @Test
    fun `example 03`() {
        val matches = arrayOf(intArrayOf(1, 2))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1), listOf(2))))
    }

    @Test
    fun `example 04`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(1, 2))))
    }

    @Test
    fun `example 05`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1, 3), listOf())))
    }

    @Test
    fun `example 06`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1), listOf(2, 3, 4))))
    }

    @Test
    fun `example 07`() {
        val matches = arrayOf(intArrayOf(2, 1), intArrayOf(3, 1))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(2, 3), listOf())))
    }

    @Test
    fun `example 08`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1), listOf(2, 3, 4))))
    }

    @Test
    fun `example 09`() {
        val matches = arrayOf(intArrayOf(5, 6), intArrayOf(6, 7), intArrayOf(7, 5))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(5, 6, 7))))
    }

    @Test
    fun `example 10`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(1, 3))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1), listOf(2))))
    }

    @Test
    fun `example 11`() {
        val matches = arrayOf(intArrayOf(10, 20), intArrayOf(20, 30), intArrayOf(30, 10))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(10, 20, 30))))
    }

    @Test
    fun `example 12`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1, 3, 5), listOf(2, 4, 6))))
    }

    @Test
    fun `example 13`() {
        val matches = arrayOf(
            intArrayOf(4, 3),
            intArrayOf(3, 2),
            intArrayOf(2, 1),
            intArrayOf(1, 4)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(1, 2, 3, 4))))
    }

    @Test
    fun `example 14`() {
        val matches = arrayOf(intArrayOf(100000, 1))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(100000), listOf(1))))
    }

    @Test
    fun `example 15`() {
        val matches = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 4)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(1), listOf(2))))
    }

    @Test
    fun `example 16`() {
        val matches = arrayOf(
            intArrayOf(9, 8),
            intArrayOf(8, 7),
            intArrayOf(7, 6),
            intArrayOf(6, 5)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(9), listOf(5, 6, 7, 8))))
    }

    @Test
    fun `example 17`() {
        val matches = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(1, 3))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(1, 2, 3))))
    }

    @Test
    fun `example 18`() {
        val matches = arrayOf(
            intArrayOf(7, 1),
            intArrayOf(7, 2),
            intArrayOf(7, 3),
            intArrayOf(1, 2)
        )
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(7), listOf(1, 3))))
    }

    @Test
    fun `example 19`() {
        val matches = arrayOf(intArrayOf(2, 1), intArrayOf(1, 2))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(), listOf(1, 2))))
    }

    @Test
    fun `example 20`() {
        val matches = arrayOf(intArrayOf(3, 1), intArrayOf(3, 2), intArrayOf(1, 2))
        assertThat(sut.findWinners(matches), `is`(listOf(listOf(3), listOf(1))))
    }
}
