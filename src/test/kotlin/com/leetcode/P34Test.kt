package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test


class P34Test {
    val sut = P34()

    @Test
    fun `example 1`() {
        assertThat(sut.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8), `is`(intArrayOf(3, 4)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6), `is`(intArrayOf(-1, -1)))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.searchRange(intArrayOf(), 0), `is`(intArrayOf(-1, -1)))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.searchRange(intArrayOf(1), 1), `is`(intArrayOf(0, 0)))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.searchRange(intArrayOf(1, 1, 2, 3, 4, 5, 6), 1), `is`(intArrayOf(0, 1)))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.searchRange(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 1), `is`(intArrayOf(0, 9)))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.searchRange(intArrayOf(1, 2, 3, 8, 8, 8, 8, 8, 8, 8, 9, 10, 11), 8), `is`(intArrayOf(3, 9)))
    }

}
