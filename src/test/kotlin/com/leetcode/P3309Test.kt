package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3309Test {
    val sut = P3309()

    @Test
    fun `example 1`() {
        assertThat(sut.maxGoodNumber(intArrayOf(1, 2, 3)), `is`(30))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxGoodNumber(intArrayOf(2, 8, 16)), `is`(1296))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxGoodNumber(intArrayOf(1, 11, 5)), `is`(221))
    }
}
