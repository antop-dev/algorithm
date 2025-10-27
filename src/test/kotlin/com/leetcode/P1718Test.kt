package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1718Test {
    val sut = P1718()

    @Test
    fun `example 1`() {
        assertThat(
            sut.constructDistancedSequence(3),
            `is`(intArrayOf(3, 1, 2, 3, 2))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.constructDistancedSequence(5),
            `is`(intArrayOf(5, 3, 1, 4, 3, 5, 2, 4, 2))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.constructDistancedSequence(1),
            `is`(intArrayOf(1))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.constructDistancedSequence(2),
            `is`(intArrayOf(2, 1, 2))
        )
    }
}