package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P217Test {
    val p = P217()

    @Test
    fun `example 01`() {
        assertThat(p.containsDuplicate(intArrayOf(1, 2, 3, 1)), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.containsDuplicate(intArrayOf(1, 2, 3, 4)), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)), `is`(true))
    }
}
