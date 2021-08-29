package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P695Test {
    val p = P695()

    @Test
    fun `example 01`() {
        assertThat(
            p.maxAreaOfIsland(
                grid = arrayOf(
                    intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
                )
            ),
            `is`(6)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.maxAreaOfIsland(
                grid = arrayOf(
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
                )
            ),
            `is`(0)
        )
    }
}
