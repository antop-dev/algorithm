package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// // https://leetcode.com/problems/fibonacci-number/
internal class P509Test {
    val p = P509()

    @Test
    fun `example 01`() {
        assertThat(p.fib(2), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.fib(3), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.fib(4), `is`(3))
    }
}
