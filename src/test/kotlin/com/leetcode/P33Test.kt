package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P33Test {
    val p = P33()

    @Test
    fun `example 01`() {
        assertThat(p.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3), `is`(-1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.search(intArrayOf(1), 0), `is`(-1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.search(intArrayOf(1, 3), 2), `is`(-1))
    }

    @Test
    fun `example 05`() {
        assertThat(p.search(intArrayOf(3, 5, 1), 3), `is`(0))
    }

    @Test
    fun `example 06`() {
        assertThat(p.search(intArrayOf(5, 1, 3), 5), `is`(0))
    }

    @Test
    fun `example 07`() {
        assertThat(p.search(intArrayOf(4, 5, 6, 7, 8, 1, 2, 3), 8), `is`(4))
    }

    @Test
    fun `example 08`() {
        assertThat(p.search(intArrayOf(3, 1), 1), `is`(1))
    }

    @Test
    fun `example 09`() {
        assertThat(p.search(intArrayOf(1, 3), 1), `is`(0))
    }
}
