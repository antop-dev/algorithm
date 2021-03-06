package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P463Test {
    val p = P463()

    @Test
    fun `example 01`() {
        val grid = arrayOf(
            intArrayOf(0, 1, 0, 0),
            intArrayOf(1, 1, 1, 0),
            intArrayOf(0, 1, 0, 0),
            intArrayOf(1, 1, 0, 0)
        )
        // [-]  [4        ]  [-]      [-]
        // [8]  [12->10->8]  [12->10] [-]
        // [-]  [14->12]     [-]      [-]
        // [16] [20->18->16] [-]      [-]
        assertThat(p.islandPerimeter(grid), `is`(16))
    }

    @Test
    fun `example 02`() {
        val grid = arrayOf(
            intArrayOf(1)
        )
        assertThat(p.islandPerimeter(grid), `is`(4))
    }

    @Test
    fun `example 03`() {
        val grid = arrayOf(
            intArrayOf(1, 0)
        )
        assertThat(p.islandPerimeter(grid), `is`(4))
    }

}
