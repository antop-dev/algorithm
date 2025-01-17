package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1781Test {
    val sut = P1781()

    @Test
    fun `example 1`() {
        assertThat(sut.beautySum("aabcb"), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.beautySum("aabcbaa"), `is`(17))
    }
}
