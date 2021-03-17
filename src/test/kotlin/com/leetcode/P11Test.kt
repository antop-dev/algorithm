package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P11Test {
    val p = P11()

    @Test
    fun `example 01`() {
        assertThat(p.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)), `is`(49))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxArea(intArrayOf(1, 1)), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.maxArea(intArrayOf(4, 3, 2, 1, 4)), `is`(16))
    }

    @Test
    fun `example 04`() {
        assertThat(p.maxArea(intArrayOf(1, 2, 1)), `is`(2))
    }

}
