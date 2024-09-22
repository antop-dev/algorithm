package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P826Test {
    val sut = P826()

    @Test
    fun `example 1`() {
        val difficulty = intArrayOf(2, 4, 6, 8, 10)
        val profit = intArrayOf(10, 20, 30, 40, 50)
        val worker = intArrayOf(4, 5, 6, 7)
        assertThat(sut.maxProfitAssignment(difficulty, profit, worker), `is`(100))
    }

    @Test
    fun `example 2`() {
        val difficulty = intArrayOf(85, 47, 57)
        val profit = intArrayOf(24, 66, 99)
        val worker = intArrayOf(40, 25, 25)
        assertThat(sut.maxProfitAssignment(difficulty, profit, worker), `is`(0))
    }

    @Test
    fun `example 3`() {
        val difficulty = intArrayOf(6, 4, 2, 8, 10)
        val profit = intArrayOf(30, 20, 100, 40, 50)
        val worker = intArrayOf(4, 5, 6, 7)
        assertThat(sut.maxProfitAssignment(difficulty, profit, worker), `is`(400))
    }

    @Test
    fun `example 4`() {
        val difficulty = intArrayOf(66, 1, 28, 73, 53, 35, 45, 60, 100, 44, 59, 94, 27, 88, 7, 18, 83, 18, 72, 63)
        val profit = intArrayOf(66, 20, 84, 81, 56, 40, 37, 82, 53, 45, 43, 96, 67, 27, 12, 54, 98, 19, 47, 77)
        val worker = intArrayOf(61, 33, 68, 38, 63, 45, 1, 10, 53, 23, 66, 70, 14, 51, 94, 18, 28, 78, 100, 16)
        assertThat(sut.maxProfitAssignment(difficulty, profit, worker), `is`(1392))
    }
}
