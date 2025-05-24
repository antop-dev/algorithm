package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1471Test {
    val sut = P1471()

    @Test
    fun `example 01`() {
        assertThat(
            sut.getStrongest(intArrayOf(1, 2, 3, 4, 5), 2),
            `is`(intArrayOf(5, 1))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.getStrongest(intArrayOf(1, 1, 3, 5, 5), 2),
            `is`(intArrayOf(5, 5))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            sut.getStrongest(intArrayOf(6, 7, 11, 7, 6, 8), 5),
            `is`(intArrayOf(11, 8, 6, 6, 7))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            sut.getStrongest(intArrayOf(-7, 22, 17, 3), 2),
            `is`(intArrayOf(22, 17))
        )
    }

}