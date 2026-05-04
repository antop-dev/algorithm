package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P856Test {
    private val sut = P856()

    @Test
    fun `example 1`() {
        assertThat(sut.scoreOfParentheses("()"), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.scoreOfParentheses("(())"), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.scoreOfParentheses("()()"), `is`(2))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.scoreOfParentheses("(()(()))"), `is`(6))
    }
}
