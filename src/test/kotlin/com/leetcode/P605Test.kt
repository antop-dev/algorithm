package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P605Test {
    val p = P605()

    @Test
    fun `example 01`() {
        assertThat(p.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.canPlaceFlowers(intArrayOf(0, 0, 1, 0, 0), 2), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.canPlaceFlowers(intArrayOf(0, 0, 0, 0, 0, 0, 0), 4), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(p.canPlaceFlowers(intArrayOf(0, 0, 0, 0, 0, 0, 0), 5), `is`(false))
    }

    @Test
    fun `example 06`() {
        assertThat(p.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 2), `is`(false))
    }

}
