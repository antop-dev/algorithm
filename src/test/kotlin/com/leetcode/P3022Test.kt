package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3022Test {
    private val sut = P3022()

    @Test
    fun `example 1`() {
        assertThat(sut.firstUniqueFreq(intArrayOf(20, 10, 30, 30)), `is`(30))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.firstUniqueFreq(intArrayOf(20, 20, 10, 30, 30, 30)), `is`(20))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.firstUniqueFreq(intArrayOf(10, 10, 20, 20)), `is`(-1))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.firstUniqueFreq(intArrayOf(10)), `is`(10))
    }
}
