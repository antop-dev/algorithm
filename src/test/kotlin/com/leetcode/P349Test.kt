package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P349Test {
    val p = P349()

    @Test
    fun `example 01`() {
        assertThat(p.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)), `is`(intArrayOf(2)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)), `is`(intArrayOf(4, 9)))
    }

}
