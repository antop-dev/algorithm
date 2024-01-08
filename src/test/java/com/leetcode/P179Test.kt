package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P179Test {
    private val sut = P179()

    @Test
    fun `example 1`() {
        assertThat(sut.largestNumber(intArrayOf(10, 2)), `is`("210"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.largestNumber(intArrayOf(3, 30, 34, 5, 9)), `is`("9534330"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.largestNumber(intArrayOf(1, 31)), `is`("311"))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.largestNumber(intArrayOf(34323, 3432)), `is`("343234323"))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.largestNumber(intArrayOf(0, 0)), `is`("0"))
    }
}
