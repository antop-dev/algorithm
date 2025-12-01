package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1894Test {
    val sut = P1894()

    @Test
    fun `example 1`() {
        assertThat(
            sut.chalkReplacer(intArrayOf(5, 1, 5), 22),
            `is`(0)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.chalkReplacer(intArrayOf(3, 4, 1, 2), 25),
            `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.chalkReplacer(intArrayOf(1,1,1), 2),
            `is`(2)
        )
    }
}