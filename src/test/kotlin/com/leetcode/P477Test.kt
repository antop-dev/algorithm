package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P477Test {
    val p = P477()

    @Test
    fun `example 01`() {
        assertThat(p.totalHammingDistance(intArrayOf(4, 14, 2)), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.totalHammingDistance(intArrayOf(4, 14, 4)), `is`(4))
    }

}
