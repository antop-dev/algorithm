package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P473Test {
    val sut = P473()

    @Test
    fun `example 1`() {
        assertThat(sut.makesquare(intArrayOf(1, 1, 2, 2, 2)), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.makesquare(intArrayOf(3, 3, 3, 3, 4)), `is`(false))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.makesquare(intArrayOf(4, 3, 2, 2, 1, 1, 1, 1, 1)), `is`(true))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.makesquare(intArrayOf(4)), `is`(false))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.makesquare(intArrayOf(5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3)), `is`(true))
    }

}
