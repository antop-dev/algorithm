package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2305Test {
    val sut = P2305()

    @Test
    fun `example 1`() {
        assertThat(
            sut.distributeCookies(intArrayOf(8, 15, 10, 20, 8), 2),
            `is`(31)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.distributeCookies(intArrayOf(6, 1, 3, 2, 2, 4, 1, 2), 3),
            `is`(7)
        )
    }

}