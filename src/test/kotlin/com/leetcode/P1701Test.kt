package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1701Test {
    val sut = P1701()

    @Test
    fun `example 1`() {
        val customers = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 5),
            intArrayOf(4, 3)
        )
        assertThat(sut.averageWaitingTime(customers), `is`(5.00000))
    }

    @Test
    fun `example 2`() {
        val customers = arrayOf(
            intArrayOf(5, 2),
            intArrayOf(5, 4),
            intArrayOf(10, 3),
            intArrayOf(20, 1)
        )
        assertThat(sut.averageWaitingTime(customers), `is`(3.25000))
    }
}
