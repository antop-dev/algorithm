package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test


class P3271Test {
    val sut = P3271()

    @Test
    fun `example 1`() {
        assertThat(sut.stringHash("abcd", 2), `is`("bf"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.stringHash("mxz", 3), `is`("i"))
    }
}
