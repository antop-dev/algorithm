package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class P1552Test {
    val sut = P1552()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maxDistance(intArrayOf(1, 2, 3, 4, 7), 3),
            equalTo(3)
        )
    }

    @Test
    fun `example 2`() {
        val position = intArrayOf(5, 4, 3, 2, 1, 1000000000)
        assertThat(sut.maxDistance(position, 2), equalTo(999999999))
        assertThat(sut.maxDistance(position, 3), equalTo(4))
        assertThat(sut.maxDistance(position, 4), equalTo(2))
        assertThat(sut.maxDistance(position, 5), equalTo(1))
        assertThat(sut.maxDistance(position, 6), equalTo(1))
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maxDistance(intArrayOf(2, 1000000000), 2),
            equalTo(999999998)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.maxDistance(intArrayOf(1, 2, 3, 4), 3),
            equalTo(1)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.maxDistance(intArrayOf(2, 1000000000), 2),
            equalTo(999999998)
        )
    }

    @Test
    fun `example 6`() {
        val position = intArrayOf(1, 4, 5, 6, 7, 8, 10)
        assertThat(sut.maxDistance(position, 2), equalTo(9))
        assertThat(sut.maxDistance(position, 3), equalTo(4))
        assertThat(sut.maxDistance(position, 4), equalTo(3))
        assertThat(sut.maxDistance(position, 5), equalTo(2))
        assertThat(sut.maxDistance(position, 6), equalTo(1))
        assertThat(sut.maxDistance(position, 7), equalTo(1))
    }

    @Test
    fun `example 7`() {
        val position = intArrayOf(79,74,57,22)
        assertThat(sut.maxDistance(position, 4), equalTo(5))
    }

}
