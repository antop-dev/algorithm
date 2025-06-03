package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1509Test {
    val sut = P1509()

    @Test
    fun `example 1`() {
        assertThat(
            sut.minDifference(intArrayOf(5, 3, 2, 4)),
            `is`(0)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.minDifference(intArrayOf(1, 5, 0, 10, 14)),
            `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.minDifference(intArrayOf(3, 100, 20)),
            `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.minDifference(intArrayOf(0, 0, 0, 0, 100, 110, 120, 130, 140, 150)),
            `is`(120)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.minDifference(intArrayOf(6, 6, 0, 1, 1, 4, 6)),
            `is`(2)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.minDifference(intArrayOf(90, 35, 67, 53, 61)),
            `is`(6)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.minDifference(intArrayOf(75, 19, 78, 9, 70, 5, 63, 90)),
            `is`(27)
        )
    }

}