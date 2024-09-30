package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P586Test {
    val sut = P586()

    @Test
    fun `example 1`() {
        assertThat(sut.maxJump(intArrayOf(0, 2, 5, 6, 7)), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxJump(intArrayOf(0, 3, 9)), `is`(9))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxJump(intArrayOf(0, 5, 12, 25, 28, 35)), `is`(20))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.maxJump(intArrayOf(0, 3)), `is`(3))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.maxJump(intArrayOf(0, 2, 16, 26, 36, 40, 58, 59, 71)), `is`(24))
    }
}
