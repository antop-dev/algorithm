package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.isIn
import org.junit.jupiter.api.Test

class P162Test {
    val sut = P162()

    @Test
    fun `example 1`() {
        assertThat(sut.findPeakElement(intArrayOf(1, 2, 3, 1)), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)), isIn(arrayOf(1, 5)))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.findPeakElement(intArrayOf(1)), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.findPeakElement(intArrayOf(1, 2)), `is`(1))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.findPeakElement(intArrayOf(2, 1)), `is`(0))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.findPeakElement(intArrayOf(1, 2, 3)), `is`(2))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.findPeakElement(intArrayOf(-2147483648, -2147483647)), `is`(1))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.findPeakElement(intArrayOf(-2147483648)), `is`(0))
    }

}
