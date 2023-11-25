package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1769Test {
    val sut = P1769()

    @Test
    fun `example 1`() {
        assertThat(sut.minOperations("110"), `is`(intArrayOf(1, 1, 3)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minOperations("001011"), `is`(intArrayOf(11, 8, 5, 4, 3, 4)))
    }
}
