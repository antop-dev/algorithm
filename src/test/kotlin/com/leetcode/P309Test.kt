package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P309Test {
    val sut = P309()

    @Test
    fun `example 1`() {
        assertThat(sut.maxProfit(intArrayOf(1, 2, 3, 0, 2)), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxProfit(intArrayOf(1)), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxProfit(intArrayOf(3, 3)), `is`(0))
    }
}
