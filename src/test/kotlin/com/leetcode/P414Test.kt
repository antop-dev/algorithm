package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P414Test {
    val p = P414()

    @Test
    fun `example 01`() {
        assertThat(p.thirdMax(intArrayOf(3, 2, 1)), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.thirdMax(intArrayOf(1, 2)), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.thirdMax(intArrayOf(2, 2, 3, 1)), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.thirdMax(intArrayOf(1, -2147483648, 2)), `is`(-2147483648))
    }

    @Test
    fun `example 05`() {
        assertThat(p.thirdMax(intArrayOf(1, 2, 2)), `is`(2))
    }

    @Test
    fun `example 06`() {
        assertThat(p.thirdMax(intArrayOf(1, 2, 2, 5, 3, 5)), `is`(2))
    }

    @Test
    fun `example 07`() {
        assertThat(p.thirdMax(intArrayOf(5, 2, 2)), `is`(5))
    }

}
