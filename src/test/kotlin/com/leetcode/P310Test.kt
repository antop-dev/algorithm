package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P310Test {
    val sut = P310()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findMinHeightTrees(
                4,
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3)
                )
            ),
            containsInAnyOrder(1)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findMinHeightTrees(
                6,
                arrayOf(
                    intArrayOf(3, 0),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2),
                    intArrayOf(3, 4),
                    intArrayOf(5, 4)
                )
            ),
            containsInAnyOrder(3, 4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findMinHeightTrees(
                6,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(0, 3),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5)
                )
            ),
            containsInAnyOrder(3)
        )
    }

}
