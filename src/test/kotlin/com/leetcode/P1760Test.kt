package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1760Test {
    val sut = P1760()

    @Test
    fun `example 1`() {
        assertThat(sut.minimumSize(intArrayOf(9), 2), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minimumSize(intArrayOf(2, 4, 8, 2), 4), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minimumSize(intArrayOf(7, 17), 2), `is`(7))
    }
}