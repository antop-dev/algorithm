package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class P1765Test {
    private val sut = P1765()

    @Test
    fun `example 01`() {
        val isWater = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 0)
        )
        val expected = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(2, 1)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 02`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(1, 2, 2)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 03`() {
        assertArrayEquals(arrayOf(intArrayOf(0)), sut.highestPeak(arrayOf(intArrayOf(1))))
    }

    @Test
    fun `example 04`() {
        assertArrayEquals(arrayOf(intArrayOf(0, 1)), sut.highestPeak(arrayOf(intArrayOf(1, 0))))
    }

    @Test
    fun `example 05`() {
        assertArrayEquals(arrayOf(intArrayOf(1, 0)), sut.highestPeak(arrayOf(intArrayOf(0, 1))))
    }

    @Test
    fun `example 06`() {
        assertArrayEquals(arrayOf(intArrayOf(0), intArrayOf(1)), sut.highestPeak(arrayOf(intArrayOf(1), intArrayOf(0))))
    }

    @Test
    fun `example 07`() {
        assertArrayEquals(arrayOf(intArrayOf(0, 1, 2, 3)), sut.highestPeak(arrayOf(intArrayOf(1, 0, 0, 0))))
    }

    @Test
    fun `example 08`() {
        assertArrayEquals(arrayOf(intArrayOf(2, 1, 0, 1, 2)), sut.highestPeak(arrayOf(intArrayOf(0, 0, 1, 0, 0))))
    }

    @Test
    fun `example 09`() {
        val isWater = arrayOf(
            intArrayOf(1),
            intArrayOf(0),
            intArrayOf(0),
            intArrayOf(0)
        )
        val expected = arrayOf(
            intArrayOf(0),
            intArrayOf(1),
            intArrayOf(2),
            intArrayOf(3)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 10`() {
        val isWater = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 11`() {
        val isWater = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1)
        )
        val expected = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 12`() {
        val isWater = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 13`() {
        val isWater = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0)
        )
        val expected = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 14`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(1, 2, 1),
            intArrayOf(2, 1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 15`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(2, 1, 2),
            intArrayOf(1, 0, 1),
            intArrayOf(2, 1, 2)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 16`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 2, 3),
            intArrayOf(1, 2, 3, 2),
            intArrayOf(2, 3, 2, 1),
            intArrayOf(3, 2, 1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 17`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(3, 2, 1, 2, 3),
            intArrayOf(2, 1, 0, 1, 2),
            intArrayOf(3, 2, 1, 2, 3)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 18`() {
        val isWater = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 1, 1),
            intArrayOf(2, 2, 2)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 19`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(1, 0, 0),
            intArrayOf(1, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(0, 1, 2),
            intArrayOf(0, 1, 2)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 20`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(6, 5, 4, 3, 2, 1),
            intArrayOf(5, 4, 3, 2, 1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 21`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(1, 2, 1),
            intArrayOf(0, 1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 22`() {
        val isWater = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 0)
        )
        val expected = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 1)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 23`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(2, 1, 2, 3),
            intArrayOf(1, 0, 1, 2),
            intArrayOf(2, 1, 2, 1),
            intArrayOf(3, 2, 1, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 24`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 0, 0, 0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 2, 3, 4, 5, 6)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 25`() {
        val isWater = arrayOf(
            intArrayOf(0),
            intArrayOf(0),
            intArrayOf(1),
            intArrayOf(0),
            intArrayOf(0)
        )
        val expected = arrayOf(
            intArrayOf(2),
            intArrayOf(1),
            intArrayOf(0),
            intArrayOf(1),
            intArrayOf(2)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 26`() {
        val isWater = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(1, 2, 3)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 27`() {
        val isWater = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 0),
            intArrayOf(1, 0)
        )
        val expected = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 2),
            intArrayOf(0, 1)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 28`() {
        val isWater = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(3, 4, 5, 6),
            intArrayOf(2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(0, 1, 2, 3)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 29`() {
        val isWater = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1)
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 1, 2),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(2, 1, 0, 0)
        )
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }

    @Test
    fun `example 30`() {
        val isWater = Array(1000) { i -> IntArray(1000) { j -> if (i == 0 && j == 0) 1 else 0 } }
        val expected = Array(1000) { i -> IntArray(1000) { j -> i + j } }
        assertArrayEquals(expected, sut.highestPeak(isWater))
    }
}
