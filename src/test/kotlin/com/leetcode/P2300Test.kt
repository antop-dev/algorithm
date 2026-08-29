package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class P2300Test {
    val sut = P2300()

    @Test
    fun `example 01`() {
        assertArrayEquals(intArrayOf(4, 0, 3), sut.successfulPairs(intArrayOf(5, 1, 3), intArrayOf(1, 2, 3, 4, 5), 7L))
    }

    @Test
    fun `example 02`() {
        assertArrayEquals(intArrayOf(2, 0, 2), sut.successfulPairs(intArrayOf(3, 1, 2), intArrayOf(8, 5, 8), 16L))
    }

    @Test
    fun `example 03`() {
        assertArrayEquals(intArrayOf(1, 0, 0), sut.successfulPairs(intArrayOf(7, 1, 2), intArrayOf(9, 2), 24L))
    }

    @Test
    fun `example 04`() {
        assertArrayEquals(
            intArrayOf(1, 1, 1, 1, 1),
            sut.successfulPairs(intArrayOf(9, 4, 1, 2, 7), intArrayOf(7), 5L)
        )
    }

    @Test
    fun `example 05`() {
        assertArrayEquals(intArrayOf(0, 0), sut.successfulPairs(intArrayOf(9, 7), intArrayOf(1), 53L))
    }

    @Test
    fun `example 06`() {
        assertArrayEquals(
            intArrayOf(1, 1, 1, 1, 1),
            sut.successfulPairs(intArrayOf(4, 10, 1, 10, 10), intArrayOf(7), 4L)
        )
    }

    @Test
    fun `example 07`() {
        assertArrayEquals(intArrayOf(1, 0), sut.successfulPairs(intArrayOf(9, 3), intArrayOf(5), 27L))
    }

    @Test
    fun `example 08`() {
        assertArrayEquals(
            intArrayOf(0, 3),
            sut.successfulPairs(intArrayOf(2, 10), intArrayOf(5, 9, 3, 2, 10), 37L)
        )
    }

    @Test
    fun `example 09`() {
        assertArrayEquals(
            intArrayOf(1, 0, 2, 0, 2, 0),
            sut.successfulPairs(intArrayOf(6, 2, 9, 2, 10, 1), intArrayOf(10, 4), 32L)
        )
    }

    @Test
    fun `example 10`() {
        assertArrayEquals(
            intArrayOf(0, 0, 1, 3, 1, 0),
            sut.successfulPairs(intArrayOf(7, 6, 8, 10, 8, 6), intArrayOf(5, 4, 3, 4, 2), 37L)
        )
    }

    @Test
    fun `example 11`() {
        assertArrayEquals(
            intArrayOf(3, 3, 3),
            sut.successfulPairs(intArrayOf(8, 6, 8), intArrayOf(5, 10, 2, 2, 9), 27L)
        )
    }

    @Test
    fun `example 12`() {
        assertArrayEquals(intArrayOf(0, 1), sut.successfulPairs(intArrayOf(3, 8), intArrayOf(7, 1, 2), 49L))
    }

    @Test
    fun `example 13`() {
        assertArrayEquals(
            intArrayOf(2, 2, 2, 3, 3),
            sut.successfulPairs(intArrayOf(6, 6, 6, 10, 8), intArrayOf(10, 8, 2, 2, 5), 31L)
        )
    }

    @Test
    fun `example 14`() {
        assertArrayEquals(
            intArrayOf(0, 0, 1, 4, 4, 1),
            sut.successfulPairs(intArrayOf(2, 1, 5, 10, 8, 5), intArrayOf(7, 6, 1, 8, 6, 3), 40L)
        )
    }

    @Test
    fun `example 15`() {
        assertArrayEquals(intArrayOf(0), sut.successfulPairs(intArrayOf(1), intArrayOf(4, 5, 3, 4), 26L))
    }

    @Test
    fun `example 16`() {
        assertArrayEquals(
            intArrayOf(0, 0, 2, 1),
            sut.successfulPairs(intArrayOf(2, 3, 8, 7), intArrayOf(9, 5, 3, 7), 56L)
        )
    }

    @Test
    fun `example 17`() {
        assertArrayEquals(
            intArrayOf(2, 2, 2, 0, 0),
            sut.successfulPairs(intArrayOf(7, 6, 7, 4, 3), intArrayOf(2, 3, 3), 15L)
        )
    }

    @Test
    fun `example 18`() {
        assertArrayEquals(
            intArrayOf(0, 0, 1, 0, 0, 0),
            sut.successfulPairs(intArrayOf(1, 8, 10, 3, 5, 5), intArrayOf(1, 3), 27L)
        )
    }

    @Test
    fun `example 19`() {
        assertArrayEquals(
            intArrayOf(2, 2, 1, 0, 2),
            sut.successfulPairs(intArrayOf(10, 10, 6, 3, 9), intArrayOf(10, 1, 8), 58L)
        )
    }

    @Test
    fun `example 20`() {
        assertArrayEquals(
            intArrayOf(1, 1, 1, 1, 0, 3),
            sut.successfulPairs(intArrayOf(7, 7, 7, 7, 2, 8), intArrayOf(7, 1, 4, 2, 4), 29L)
        )
    }

    @Test
    fun `example 21`() {
        assertArrayEquals(intArrayOf(0, 1), sut.successfulPairs(intArrayOf(6, 10), intArrayOf(1), 7L))
    }

    @Test
    fun `example 22`() {
        assertArrayEquals(intArrayOf(4), sut.successfulPairs(intArrayOf(3), intArrayOf(9, 2, 6, 10, 1), 5L))
    }

    @Test
    fun `example 23`() {
        assertArrayEquals(
            intArrayOf(5, 5),
            sut.successfulPairs(intArrayOf(7, 3), intArrayOf(5, 6, 10, 6, 8), 8L)
        )
    }

    @Test
    fun `example 24`() {
        assertArrayEquals(intArrayOf(4), sut.successfulPairs(intArrayOf(8), intArrayOf(8, 8, 5, 2), 10L))
    }

    @Test
    fun `example 25`() {
        assertArrayEquals(intArrayOf(2), sut.successfulPairs(intArrayOf(6), intArrayOf(5, 8, 3, 9, 1, 4), 34L))
    }

    @Test
    fun `example 26`() {
        assertArrayEquals(intArrayOf(1, 0, 1), sut.successfulPairs(intArrayOf(9, 1, 9), intArrayOf(5, 2), 45L))
    }

    @Test
    fun `example 27`() {
        assertArrayEquals(
            intArrayOf(3, 0, 3),
            sut.successfulPairs(intArrayOf(6, 3, 6), intArrayOf(4, 9, 9, 9, 6), 41L)
        )
    }

    @Test
    fun `example 28`() {
        assertArrayEquals(
            intArrayOf(3, 3),
            sut.successfulPairs(intArrayOf(4, 4), intArrayOf(7, 4, 4, 9, 8), 23L)
        )
    }

    @Test
    fun `example 29`() {
        assertArrayEquals(
            intArrayOf(0, 1, 1, 1, 0, 1),
            sut.successfulPairs(intArrayOf(1, 5, 8, 5, 4, 10), intArrayOf(6), 29L)
        )
    }

    @Test
    fun `example 30`() {
        assertArrayEquals(
            intArrayOf(1, 0, 0, 0, 0, 3),
            sut.successfulPairs(intArrayOf(6, 2, 4, 2, 4, 8), intArrayOf(4, 6, 4), 31L)
        )
    }
}
