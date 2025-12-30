package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P481Test {
    val sut = P481()

    @Test
    fun `example 1`() {
        assertThat(sut.magicalString(6), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.magicalString(1), `is`(1))
    }
}