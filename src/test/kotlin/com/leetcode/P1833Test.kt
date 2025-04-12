package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1833Test {
    val sut = P1833()

    @Test
    fun `example 1`() {
        assertThat(sut.maxIceCream(intArrayOf(1, 3, 2, 4, 1), 7), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxIceCream(intArrayOf(10, 6, 8, 7, 7, 8), 5), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxIceCream(intArrayOf(1, 6, 3, 1, 2, 5), 20), `is`(6))
    }
}
