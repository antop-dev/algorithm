package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P268Test {
    val p = P268()

    @Test
    fun `example 01`() {
        assertThat(p.missingNumber(intArrayOf(3, 0, 1)), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)), `is`(8))
    }

    @Test
    fun `example 03`() {
        assertThat(p.missingNumber(intArrayOf(0)), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.missingNumber(intArrayOf(0, 1, 2, 3, 4, 5, 6)), `is`(7))
    }
}
