package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P575Test {
    val p = P575()

    @Test
    fun `example 01`() {
        assertThat(p.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.distributeCandies(intArrayOf(1, 1, 2, 3)), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.distributeCandies(intArrayOf(6, 6, 6, 6)), `is`(1))
    }

}
