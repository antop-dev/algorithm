package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P338Test {
    val p = P338()

    @Test
    fun `example 01`() {
        assertThat(p.countBits(2), `is`(intArrayOf(0, 1, 1)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.countBits(5), `is`(intArrayOf(0, 1, 1, 2, 1, 2)))
    }

}
