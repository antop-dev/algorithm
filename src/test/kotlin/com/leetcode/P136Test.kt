package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P136Test {
    val p = P136()

    @Test
    fun `example 01`() {
        assertThat(p.singleNumber(intArrayOf(2, 2, 1)), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.singleNumber(intArrayOf(4, 1, 2, 1, 2)), `is`(4))
    }
}
