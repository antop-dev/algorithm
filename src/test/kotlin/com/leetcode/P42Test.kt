package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42Test {
    val p = P42()

    @Test
    fun `example 01`() {
        assertThat(p.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.trap(intArrayOf(4, 2, 0, 3, 2, 5)), `is`(9))
    }

}
