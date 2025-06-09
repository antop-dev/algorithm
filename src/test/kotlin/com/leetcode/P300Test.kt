package com.leetcode

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

internal class P300Test {
    private val sut = P300()

    @Test
    fun `example 1`() {
        MatcherAssert.assertThat(sut.lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)), Matchers.`is`(4))
    }

    @Test
    fun `example 2`() {
        MatcherAssert.assertThat(sut.lengthOfLIS(intArrayOf(0, 1, 0, 3, 2, 3)), Matchers.`is`(4))
    }

    @Test
    fun `example 3`() {
        MatcherAssert.assertThat(sut.lengthOfLIS(intArrayOf(7, 7, 7, 7, 7, 7, 7)), Matchers.`is`(1))
    }

    @Test
    fun `example 4`() {
        MatcherAssert.assertThat(sut.lengthOfLIS(intArrayOf(1, 3, 6, 7, 9, 4, 10, 5, 6)), Matchers.`is`(6))
    }
}