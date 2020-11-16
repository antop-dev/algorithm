package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

internal class P892Test {
    val p = P892()

    @Test
    fun `example 01`() {
        val grid = arrayOf(intArrayOf(2))
        assertThat(p.surfaceArea(grid), Matchers.`is`(10))
    }

    @Test
    fun `example 02`() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        assertThat(p.surfaceArea(grid), Matchers.`is`(34))
    }

    @Test
    fun `example 03`() {
        val grid = arrayOf(intArrayOf(1, 0), intArrayOf(0, 2))
        assertThat(p.surfaceArea(grid), Matchers.`is`(16))
    }

    @Test
    fun `example 04`() {
        val grid = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        assertThat(p.surfaceArea(grid), Matchers.`is`(32))
    }
}
