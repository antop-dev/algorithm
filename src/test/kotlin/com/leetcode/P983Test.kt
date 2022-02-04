package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P983Test {
    val p = P983()

    @Test
    fun `example 01`() {
        assertThat(p.mincostTickets(intArrayOf(1, 4, 6, 7, 8, 20), intArrayOf(2, 7, 15)), `is`(11))
    }

    @Test
    fun `example 02`() {
        assertThat(p.mincostTickets(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31), intArrayOf(2, 7, 15)), `is`(17))
    }

    @Test
    fun `example 03`() {
        assertThat(p.mincostTickets(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31), intArrayOf(15, 2, 7)), `is`(6))
    }

}
