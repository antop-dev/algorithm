package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P720Test {
    val p = P720()

    @Test
    fun `example 01`() {
        assertThat(p.longestWord(arrayOf("w", "wo", "wor", "worl", "world")), `is`("world"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestWord(arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")), `is`("apple"))
    }

}
