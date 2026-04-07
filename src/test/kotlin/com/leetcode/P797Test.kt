package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P797Test {
    private val sut = P797()

    @Test
    fun `example 1`() {
        val graph = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3),
            intArrayOf(3),
            intArrayOf()
        )
        val expected = listOf(
            listOf(0, 1, 3),
            listOf(0, 2, 3)
        )
        assertThat(sut.allPathsSourceTarget(graph), `is`(expected))
    }

    @Test
    fun `example 2`() {
        val graph = arrayOf(
            intArrayOf(4, 3, 1),
            intArrayOf(3, 2, 4),
            intArrayOf(3),
            intArrayOf(4),
            intArrayOf()
        )
        val expected = listOf(
            listOf(0, 4),
            listOf(0, 3, 4),
            listOf(0, 1, 3, 4),
            listOf(0, 1, 2, 3, 4),
            listOf(0, 1, 4)
        )
        assertThat(sut.allPathsSourceTarget(graph), `is`(expected))
    }

    @Test
    fun `example 3`() {
        val graph = arrayOf(
            intArrayOf(4, 3, 1),
            intArrayOf(3, 2, 4),
            intArrayOf(),
            intArrayOf(4),
            intArrayOf()
        )
        val expected = listOf(
            listOf(0, 4),
            listOf(0, 3, 4),
            listOf(0, 1, 3, 4),
            listOf(0, 1, 4)
        )
        assertThat(sut.allPathsSourceTarget(graph), `is`(expected))
    }
}
