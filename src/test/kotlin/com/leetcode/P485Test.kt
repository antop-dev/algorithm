package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P485Test {
    val p = P485()

    @Test
    fun `example 01`() {
        assertThat(p.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.findMaxConsecutiveOnes(intArrayOf(0, 1, 0, 1, 1)), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.findMaxConsecutiveOnes(intArrayOf(1, 1, 1, 1, 1)), `is`(5))
    }

    @Test
    fun `example 04`() {
        assertThat(p.findMaxConsecutiveOnes(intArrayOf(1, 1, 1, 1, 0, 1)), `is`(4))
    }

}
