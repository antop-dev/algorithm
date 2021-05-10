package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P238Test {
    val p = P238()

    @Test
    fun `example 01`() {
        assertThat(
            p.productExceptSelf(intArrayOf(1, 2, 3, 4)),
            `is`(intArrayOf(24, 12, 8, 6))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)),
            `is`(intArrayOf(0, 0, 9, 0, 0))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.productExceptSelf(intArrayOf(0, 0)),
            `is`(intArrayOf(0, 0))
        )
    }

}
