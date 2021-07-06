package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1414Test {
    val p = P1414()

    @Test
    fun `example 01`() {
        assertThat(p.findMinFibonacciNumbers(7), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.findMinFibonacciNumbers(10), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.findMinFibonacciNumbers(19), `is`(3))
    }

    @Test
    fun `example 04`() {
        assertThat(p.findMinFibonacciNumbers(837829048), `is`(14))
    }

}
