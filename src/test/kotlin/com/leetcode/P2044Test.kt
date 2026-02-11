package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2044Test {
    val sut = P2044()

    @Test
    fun `example 1`() {
        assertThat(
            sut.countMaxOrSubsets(intArrayOf(3, 1)),
            `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.countMaxOrSubsets(intArrayOf(2, 2, 2)),
            `is`(7)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.countMaxOrSubsets(intArrayOf(3, 2, 1, 5)),
            `is`(6)
        )
    }
}
