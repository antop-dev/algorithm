package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P164Test {
    val sut = P164()

    @Test
    fun `example 01`() {
        assertThat(sut.maximumGap(intArrayOf(3, 6, 9, 1)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.maximumGap(intArrayOf(10)), `is`(0))
    }

}
