package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1386Test {
    val sut = P1386()

    @Test
    fun `example 01`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 8),
            intArrayOf(2, 6),
            intArrayOf(3, 1),
            intArrayOf(3, 10),
        )
        assertThat(sut.maxNumberOfFamilies(3, reservedSeats), `is`(4))
    }

    @Test
    fun `example 02`() {
        val reservedSeats = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 8),
            intArrayOf(2, 6)
        )
        assertThat(sut.maxNumberOfFamilies(2, reservedSeats), `is`(2))
    }

    @Test
    fun `example 03`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(1, 7),
            intArrayOf(4, 3),
            intArrayOf(4, 6),
        )
        assertThat(sut.maxNumberOfFamilies(4, reservedSeats), `is`(4))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf()), `is`(2))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.maxNumberOfFamilies(5, arrayOf()), `is`(10))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 1))), `is`(2))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 10))), `is`(2))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 5))), `is`(1))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 2))), `is`(1))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 6))), `is`(1))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 5), intArrayOf(1, 6))), `is`(0))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 4), intArrayOf(1, 7))), `is`(0))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 3), intArrayOf(1, 8))), `is`(1))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.maxNumberOfFamilies(2, arrayOf(intArrayOf(1, 5), intArrayOf(2, 6))), `is`(2))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.maxNumberOfFamilies(3, arrayOf(intArrayOf(2, 1), intArrayOf(2, 10))), `is`(6))
    }

    @Test
    fun `example 16`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(1, 6),
            intArrayOf(1, 7),
            intArrayOf(1, 8),
            intArrayOf(1, 9)
        )
        assertThat(sut.maxNumberOfFamilies(10, reservedSeats), `is`(18))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.maxNumberOfFamilies(1, arrayOf(intArrayOf(1, 1), intArrayOf(1, 10))), `is`(2))
    }

    @Test
    fun `example 18`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(1, 6),
            intArrayOf(2, 5)
        )
        assertThat(sut.maxNumberOfFamilies(2, reservedSeats), `is`(1))
    }

    @Test
    fun `example 19`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(2, 5),
            intArrayOf(3, 5),
            intArrayOf(4, 5)
        )
        assertThat(sut.maxNumberOfFamilies(4, reservedSeats), `is`(4))
    }

    @Test
    fun `example 20`() {
        val reservedSeats = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 8),
            intArrayOf(3, 6)
        )
        assertThat(sut.maxNumberOfFamilies(3, reservedSeats), `is`(4))
    }
}
