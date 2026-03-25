package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2442Test {
    private val sut = P2442()

    @Test
    fun `example 01`() {
        // Input: nums = [1,13,10,12,31]
        // Output: 6
        val ans = sut.countDistinctIntegers(intArrayOf(1, 13, 10, 12, 31))
        assertThat(ans, `is`(6))
    }

    @Test
    fun `example 02`() {
        // Input: nums = [2,2,2]
        // Output: 1
        val ans = sut.countDistinctIntegers(intArrayOf(2, 2, 2))
        assertThat(ans, `is`(1))
    }
}
