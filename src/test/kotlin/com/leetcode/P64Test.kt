package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P64Test {
    val p = P64()

    @Test
    fun `example 01`() {
        assertThat(
            p.minPathSum(
                grid = arrayOf(
                    intArrayOf(1, 3, 1),
                    intArrayOf(1, 5, 1),
                    intArrayOf(4, 2, 1)
                )
            ), `is`(7)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.minPathSum(
                grid = arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6)
                )
            ), `is`(12)
        )
    }
}
