package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1395Test {
    val p = P1395()

    @Test
    fun `example 01`() {
        assertThat(p.numTeams(rating = intArrayOf(2, 5, 3, 4, 1)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.numTeams(rating = intArrayOf(2, 1, 3)), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.numTeams(rating = intArrayOf(1, 2, 3, 4)), `is`(4))
    }

}
