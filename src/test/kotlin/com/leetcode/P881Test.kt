package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P881Test {
    val sut = P881()

    @Test
    fun `example 1`() {
        assertThat(sut.numRescueBoats(intArrayOf(1, 2), 3), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numRescueBoats(intArrayOf(3, 2, 2, 1), 3), `is`(3))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numRescueBoats(intArrayOf(3, 5, 3, 4), 5), `is`(4))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.numRescueBoats(intArrayOf(1, 1, 1, 1, 1), 5), `is`(3))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.numRescueBoats(intArrayOf(5, 1, 4, 2), 6), `is`(2))
    }

}
