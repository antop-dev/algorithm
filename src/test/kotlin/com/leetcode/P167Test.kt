package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P167Test {
    val p = P167()

    @Test
    fun `example 01`() {
        assertThat(p.twoSum(intArrayOf(2, 7, 11, 15), 9), `is`(intArrayOf(1, 2)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.twoSum(intArrayOf(2, 3, 4), 6), `is`(intArrayOf(1, 3)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.twoSum(intArrayOf(-1, 0), -1), `is`(intArrayOf(1, 2)))
    }

    @Test
    fun `example 04`() {
        assertThat(p.twoSum(intArrayOf(5, 25, 75), 100), `is`(intArrayOf(2, 3)))
    }

}
