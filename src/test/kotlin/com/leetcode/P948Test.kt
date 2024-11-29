package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P948Test {
    val sut = P948()

    @Test
    fun `example 1`() {
        assertThat(sut.bagOfTokensScore(intArrayOf(100), 50), `is`(0))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.bagOfTokensScore(intArrayOf(200, 100), 150), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.bagOfTokensScore(intArrayOf(100, 200, 300, 400), 200),
            `is`(2)
        )
    }
}
