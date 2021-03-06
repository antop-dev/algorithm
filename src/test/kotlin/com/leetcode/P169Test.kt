package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P169Test {
    val p = P169()

    @Test
    fun `example 01`() {
        assertThat(p.majorityElement(intArrayOf(3, 2, 3)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.majorityElement(intArrayOf(3, 3, 4)), `is`(3))
    }
}
