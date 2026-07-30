package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1456Test {
    private val sut = P1456()

    @Test
    fun `example 1`() {
        val s = "abciiidef"
        val k = 3
        assertThat(sut.maxVowels(s, k), `is`(3))
    }

    @Test
    fun `example 2`() {
        val s = "aeiou"
        val k = 2
        assertThat(sut.maxVowels(s, k), `is`(2))
    }

    @Test
    fun `example 3`() {
        val s = "leetcode"
        val k = 3
        assertThat(sut.maxVowels(s, k), `is`(2))
    }

    @Test
    fun `example 4`() {
        val s = "rhythms"
        val k = 4
        assertThat(sut.maxVowels(s, k), `is`(0))
    }

    @Test
    fun `example 5`() {
        val s = "tryhard"
        val k = 4
        assertThat(sut.maxVowels(s, k), `is`(1))
    }
}
