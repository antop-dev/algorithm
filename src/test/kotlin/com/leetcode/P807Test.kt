package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P807Test {
    val p = P807()

    @Test
    fun `example 01`() {
        val grid = arrayOf(
            intArrayOf(3, 0, 8, 4),
            intArrayOf(2, 4, 5, 7),
            intArrayOf(9, 2, 6, 3),
            intArrayOf(0, 3, 1, 0)
        )

        assertThat(p.maxIncreaseKeepingSkyline(grid), `is`(35))
    }
}
