package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1442Test {
    val sut = P1442()

    @Test
    fun `example 01`() {
        assertThat(sut.countTriplets(intArrayOf(2, 3, 1, 6, 7)), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.countTriplets(intArrayOf(1, 1, 1, 1, 1)), `is`(10))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.countTriplets(intArrayOf(2, 3)), `is`(0))
    }
}
