package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P70Test {
    val p = P70()

    @Test
    fun `example 1`() {
        assertThat(p.climbStairs(2), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(p.climbStairs(3), `is`(3))
    }

    @Test
    fun `example 3`() {
        assertThat(p.climbStairs(4), `is`(5))
    }

    @Test
    fun `example 4`() {
        assertThat(p.climbStairs(5), `is`(8))
    }

    @Test
    fun `example 5`() {
        assertThat(p.climbStairs(6), `is`(13))
    }
}
