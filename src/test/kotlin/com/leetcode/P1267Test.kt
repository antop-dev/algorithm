package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1267Test {
    private val sut = P1267()

    @Test
    fun `example 01`() {
        // Input: grid = [[1,0],[0,1]]
        // Output: 0
        val grid = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1)
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(0))
    }

    @Test
    fun `example 02`() {
        // Input: grid = [[1,0],[1,1]]
        // Output: 3
        val grid = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 1),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(3))
    }

    @Test
    fun `example 03`() {
        // Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
        // Output: 4
        val grid = arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(4))
    }

    @Test
    fun `example 04`() {
        // Input: grid = [[1,0,0,1,0],[0,0,0,0,0],[0,0,0,1,0]]
        // Output: 3
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(3))
    }

    @Test
    fun `example 05`() {
        // Input: grid = [[0,0,1,0,1],[0,1,0,1,0],[0,1,1,1,0],[1,0,0,1,1],[0,0,1,1,0]]
        // Output: 12
        val grid = arrayOf(
            intArrayOf(0, 0, 1, 0, 1),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 1, 1),
            intArrayOf(0, 0, 1, 1, 0),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(12))
    }

    @Test
    fun `example 06`() {
        // Input: grid = [[1,0,0,1,0],[0,0,0,0,0],[0,0,0,1,0],[0,0,0,1,1]]
        // Output: 5
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 1, 1),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(5))
    }


    @Test
    fun `example 07`() {
        // Input: grid = [[1,0,0,0,1],[0,0,0,0,0],[0,0,1,0,1]]
        // Output: 4
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 1),
        )
        val ans = sut.countServers(grid)
        assertThat(ans, `is`(4))
    }


}
