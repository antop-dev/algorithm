package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1963Test {
    val sut = P1963()

    @Test
    fun `example 1`() {
        assertThat(sut.minSwaps("][]["), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minSwaps("]]][[["), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minSwaps("[]"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.minSwaps("]]]][[][][[]][][[["), `is`(2))
    }
}
