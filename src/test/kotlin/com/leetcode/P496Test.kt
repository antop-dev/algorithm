package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P496Test {
    val p = P496()

    @Test
    fun `example 01`() {
        assertThat(
            p.nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)),
            `is`(intArrayOf(-1, 3, -1))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4)),
            `is`(intArrayOf(3, -1))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.nextGreaterElement(intArrayOf(1, 2, 3, 4), intArrayOf(1, 3, 4, 2)),
            `is`(intArrayOf(3, -1, 4, -1))
        )
    }

}
