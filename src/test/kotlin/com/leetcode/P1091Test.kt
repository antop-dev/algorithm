package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1091Test {
    private val sut = P1091()

    @Test
    fun `example 1`() {
        // Input: s1 = "parker", s2 = "morris", baseStr = "parser"
        // Output: "makkek"
        val s1 = "parker"
        val s2 = "morris"
        val baseStr = "parser"
        val ans = sut.smallestEquivalentString(s1, s2, baseStr)
        assertThat(ans, `is`("makkek"))
    }

    @Test
    fun `example 2`() {
        // Input: s1 = "hello", s2 = "world", baseStr = "hold"
        // Output: "hdld"
        val s1 = "hello"
        val s2 = "world"
        val baseStr = "hold"
        val ans = sut.smallestEquivalentString(s1, s2, baseStr)
        assertThat(ans, `is`("hdld"))
    }

    @Test
    fun `example 3`() {
        // Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode"
        // Output: "aauaaaaada"
        val s1 = "leetcode"
        val s2 = "programs"
        val baseStr = "sourcecode"
        val ans = sut.smallestEquivalentString(s1, s2, baseStr)
        assertThat(ans, `is`("aauaaaaada"))
    }
}
