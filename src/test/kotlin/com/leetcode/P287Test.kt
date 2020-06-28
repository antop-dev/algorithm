package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P287Test {
    val p = P287()

    @Test
    fun `example 01`() {
        assertThat(p.findDuplicate(intArrayOf(1, 3, 4, 2, 2)), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.findDuplicate(intArrayOf(3, 1, 3, 4, 2)), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.findDuplicate(intArrayOf(2, 2, 2, 2, 2)), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(p.findDuplicate(intArrayOf(2, 5, 9, 6, 9, 3, 8, 9, 7, 1)), `is`(9))
    }
}
