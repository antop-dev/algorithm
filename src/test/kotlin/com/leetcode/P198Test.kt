package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P198Test {
    val sut = P198()

    @Test
    fun `example 1`() {
        assertThat(sut.rob(intArrayOf(1, 2, 3, 1)), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.rob(intArrayOf(2, 7, 9, 3, 1)), `is`(12))
    }

}
