package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P150Test {
    val sut = P150()

    @Test
    fun `example 1`() {
        assertThat(sut.evalRPN(arrayOf("2", "1", "+", "3", "*")), `is`(9))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.evalRPN(arrayOf("4", "13", "5", "/", "+")), `is`(6))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")), `is`(22))
    }

}
