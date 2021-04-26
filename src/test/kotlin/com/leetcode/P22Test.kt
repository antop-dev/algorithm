package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P22Test {
    val p = P22()

    @Test
    fun `example 01`() {
        assertThat(
            p.generateParenthesis(1),
            `is`(listOf("()"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.generateParenthesis(2),
            `is`(listOf("(())", "()()"))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.generateParenthesis(3),
            `is`(listOf("((()))", "(()())", "(())()", "()(())", "()()()"))
        )
    }


}
