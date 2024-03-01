package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2364Test {
    val sut = P2364()

    @Test
    fun `example 1`() {
        assertThat(sut.countBadPairs(intArrayOf(4, 1, 3, 3)), `is`(5L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countBadPairs(intArrayOf(1, 2, 3, 4, 5)), `is`(0L))
    }

    @Test
    fun `example 3`() {
        val nums = IntArray(100000) { 1000000000 }
        assertThat(sut.countBadPairs(nums), `is`(704982704L))
    }
}
