package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P55Test {
    val p = P55()

    @Test
    fun `example 01`() {
        assertThat(p.canJump(intArrayOf(2, 3, 1, 1, 4)), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canJump(intArrayOf(3, 2, 1, 0, 4)), `is`(false))
    }

}
