package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P565Test {
    val sut = P565()

    @Test
    fun `example 1`() {
        assertThat(sut.arrayNesting(intArrayOf(5, 4, 0, 3, 1, 6, 2)), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.arrayNesting(intArrayOf(0, 1, 2)), `is`(1))
    }

}
