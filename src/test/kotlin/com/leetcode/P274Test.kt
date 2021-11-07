package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P274Test {
    val p = P274()

    @Test
    fun `example 01`() {
        assertThat(p.hIndex(intArrayOf(3, 0, 6, 1, 5)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.hIndex(intArrayOf(1, 3, 1)), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.hIndex(intArrayOf(100)), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.hIndex(intArrayOf(11, 15)), `is`(2))
    }

}
