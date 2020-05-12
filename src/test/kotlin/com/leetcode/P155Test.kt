package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P155Test {

    @Test
    fun `example 1`() {
        val minStack = P155()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assertThat(minStack.getMin(), `is`(-3))
        minStack.pop()
        assertThat(minStack.top(), `is`(0))
        assertThat(minStack.getMin(), `is`(-2))
    }

    @Test
    fun `example 2`() {
        val minStack = P155()
        minStack.push(-1)
        minStack.top()
        assertThat(minStack.getMin(), `is`(-1))
    }

}
