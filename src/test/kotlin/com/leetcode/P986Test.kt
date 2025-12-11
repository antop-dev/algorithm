package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P986Test {
    val sut = P986()

    @Test
    fun `example 1`() {
        val firstList = arrayOf(
            intArrayOf(0, 2),
            intArrayOf(5, 10),
            intArrayOf(13, 23),
            intArrayOf(24, 25),
        )
        val secondList = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(8, 12),
            intArrayOf(15, 24),
            intArrayOf(25, 26),
        )
        val ans = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(5, 5),
            intArrayOf(8, 10),
            intArrayOf(15, 23),
            intArrayOf(24, 24),
            intArrayOf(25, 25),
        )
        assertThat(
            sut.intervalIntersection(firstList, secondList),
            `is`(ans)
        )
    }

    @Test
    fun `example 2`() {
        val firstList = arrayOf(intArrayOf(1, 3), intArrayOf(5, 9))
        val secondList = arrayOf<IntArray>()
        val ans = arrayOf<IntArray>()
        assertThat(sut.intervalIntersection(firstList, secondList), `is`(ans))
    }

    @Test
    fun `example 3`() {
        val firstList = arrayOf(
            intArrayOf(4, 5),
            intArrayOf(9, 20),
        )
        val secondList = arrayOf<IntArray>(
            intArrayOf(4, 5),
            intArrayOf(7, 10),
            intArrayOf(11, 12),
            intArrayOf(14, 15),
            intArrayOf(16, 20),
        )
        val ans = arrayOf<IntArray>(
            intArrayOf(4, 5),
            intArrayOf(9, 10),
            intArrayOf(11, 12),
            intArrayOf(14, 15),
            intArrayOf(16, 20),
        )
        assertThat(sut.intervalIntersection(firstList, secondList), `is`(ans))
    }
}