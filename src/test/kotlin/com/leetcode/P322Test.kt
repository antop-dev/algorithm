package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P322Test {
    val p = P322()

    @Test
    fun `example 01`() {
        assertThat(p.coinChange(intArrayOf(1, 2, 5), 11), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.coinChange(intArrayOf(2), 3), `is`(-1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.coinChange(intArrayOf(1), 0), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.coinChange(intArrayOf(186, 419, 83, 408), 6249), `is`(20))
    }

}
