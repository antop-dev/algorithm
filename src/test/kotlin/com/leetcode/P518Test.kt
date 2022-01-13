package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P518Test {
    val p = P518()

    @Test
    fun `example 01`() {
        assertThat(p.change(5, intArrayOf(1, 2, 5)), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.change(3, intArrayOf(2)), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.change(10, intArrayOf(10)), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.change(11, intArrayOf(1, 2, 5)), `is`(11))
    }

    @Test
    fun `example 05`() {
        assertThat(p.change(0, intArrayOf(7)), `is`(1))
    }

    @Test
    fun `example 06`() {
        assertThat(p.change(500, intArrayOf(1, 2, 5)), `is`(12701))
    }

}
