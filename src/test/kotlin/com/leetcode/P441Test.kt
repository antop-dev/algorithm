package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P441Test {
    val p = P441()

    @Test
    fun `example 01`() {
        assertThat(p.arrangeCoins(5), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.arrangeCoins(8), `is`(3))
    }
}
