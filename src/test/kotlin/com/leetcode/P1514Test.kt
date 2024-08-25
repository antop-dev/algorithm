package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1514Test {
    val sut = P1514()

    @Test
    fun `example 1`() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))
        val succProb = doubleArrayOf(0.5, 0.5, 0.2)
        val start = 0
        val end = 2
        assertThat(sut.maxProbability(n, edges, succProb, start, end), `is`(0.25))
    }

    @Test
    fun `example 2`() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))
        val succProb = doubleArrayOf(0.5, 0.5, 0.3)
        val start = 0
        val end = 2
        assertThat(sut.maxProbability(n, edges, succProb, start, end), `is`(0.3))
    }

    @Test
    fun `example 3`() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1))
        val succProb = doubleArrayOf(0.5)
        val start = 0
        val end = 2
        assertThat(sut.maxProbability(n, edges, succProb, start, end), `is`(0.0))
    }

    @Test
    fun `example 4`() {
        val n = 500
        val edges = arrayOf(
            intArrayOf(193, 229),
            intArrayOf(133, 212),
            intArrayOf(224, 465),
        )
        val succProb = doubleArrayOf(0.91, 0.78, 0.64)
        val start = 4
        val end = 364
        assertThat(sut.maxProbability(n, edges, succProb, start, end), `is`(0.0))
    }

}
