package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1248Test {
    val p = P1248()

    @Test
    fun `example 01`() {
        assertThat(p.numberOfSubarrays(intArrayOf(1, 1, 2, 1, 1), 3), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.numberOfSubarrays(intArrayOf(2, 4, 6), 1), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.numberOfSubarrays(intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), 2), `is`(16))
    }

    @Test
    fun `example 04`() {
        assertThat(p.numberOfSubarrays(intArrayOf(2, 1, 2, 1, 2, 1, 2, 1, 2), 2), `is`(12))
    }

}
