package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3341Test {
    val sut = P3341()

    @Test
    fun `example 1`() {
        val moveTime = arrayOf(
            intArrayOf(0, 4), intArrayOf(4, 4)
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(6))
    }

    @Test
    fun `example 2`() {
        val moveTime = arrayOf(
            intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(3))
    }

    @Test
    fun `example 3`() {
        val moveTime = arrayOf(
            intArrayOf(0, 1), intArrayOf(1, 2)
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(3))
    }

    @Test
    fun `example 4`() {
        val moveTime = arrayOf(
            intArrayOf(0, 58),
            intArrayOf(27, 69),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(70))
    }

    @Test
    fun `example 5`() {
        val moveTime = arrayOf(
            intArrayOf(0, 8),
            intArrayOf(5, 0),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(7))
    }

    @Test
    fun `example 6`() {
        val moveTime = arrayOf(
            intArrayOf(10, 0),
            intArrayOf(0, 0),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(2))
    }

    @Test
    fun `example 7`() {
        val moveTime = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0)
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(4))
    }

    @Test
    fun `example 8`() {
        val moveTime = arrayOf(
            intArrayOf(94, 79, 62, 27, 69, 84),
            intArrayOf(6, 32, 11, 82, 42, 30)
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(72))
    }

    @Test
    fun `example 9`() {
        val moveTime = arrayOf(
            intArrayOf(100, 9, 10, 11),
            intArrayOf(1, 8, 99, 12),
            intArrayOf(2, 7, 6, 13),
            intArrayOf(3, 4, 5, 14),
        )
        assertThat(sut.minTimeToReach(moveTime), `is`(15))
    }
}
