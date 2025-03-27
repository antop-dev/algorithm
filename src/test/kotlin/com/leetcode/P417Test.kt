package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P417Test {
    val sut = P417()

    @Test
    fun `example 1`() {
        assertThat(
            sut.pacificAtlantic(
                arrayOf(
                    intArrayOf(1, 2, 2, 3, 5),
                    intArrayOf(3, 2, 3, 4, 4),
                    intArrayOf(2, 4, 5, 3, 1),
                    intArrayOf(6, 7, 1, 4, 5),
                    intArrayOf(5, 1, 1, 2, 4),
                )
            ), containsInAnyOrder(
                listOf(0, 4),
                listOf(1, 3),
                listOf(1, 4),
                listOf(2, 2),
                listOf(3, 0),
                listOf(3, 1),
                listOf(4, 0),
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.pacificAtlantic(
                arrayOf(
                    intArrayOf(1),
                )
            ), containsInAnyOrder(
                listOf(0, 0),
            )
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.pacificAtlantic(
                arrayOf(
                    intArrayOf(1, 2, 3, 4, 5),
                    intArrayOf(2, 3, 4, 5, 6),
                    intArrayOf(3, 4, 5, 6, 7),
                    intArrayOf(4, 5, 6, 7, 8),
                    intArrayOf(5, 6, 7, 8, 9),
                )
            ), containsInAnyOrder(
                listOf(0, 4),
                listOf(1, 4),
                listOf(2, 4),
                listOf(3, 4),
                listOf(4, 0),
                listOf(4, 1),
                listOf(4, 2),
                listOf(4, 3),
                listOf(4, 4)
            )
        )
    }
}
