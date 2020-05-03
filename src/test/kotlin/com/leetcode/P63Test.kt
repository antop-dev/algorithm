package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P63Test {
    val p = P63()

    @Test
    fun `example 1`() {
        val obstacleGrid = p.uniquePathsWithObstacles(arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
        ))
        assertThat(obstacleGrid, `is`(2))
    }

    @Test
    fun `example 2`() {
        val obstacleGrid = p.uniquePathsWithObstacles(arrayOf(
                intArrayOf(0, 1, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)
        ))
        assertThat(obstacleGrid, `is`(1))
    }

}