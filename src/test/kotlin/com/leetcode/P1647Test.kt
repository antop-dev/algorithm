package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1647Test {
    private val sut = P1647()

    @Test
    fun `example 01`() {
        val s = "aab"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 02`() {
        val s = "aaabbbcc"
        assertThat(sut.minDeletions(s), `is`(2))
    }

    @Test
    fun `example 03`() {
        val s = "ceabaacb"
        assertThat(sut.minDeletions(s), `is`(2))
    }

    // s.length가 최소(1)인 경우
    @Test
    fun `example 04`() {
        val s = "a"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 05`() {
        val s = "ab"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 06`() {
        val s = "abc"
        assertThat(sut.minDeletions(s), `is`(2))
    }

    @Test
    fun `example 07`() {
        val s = "aa"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 08`() {
        val s = "aabb"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 09`() {
        val s = "aaabbb"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 10`() {
        val s = "abcabc"
        assertThat(sut.minDeletions(s), `is`(3))
    }

    @Test
    fun `example 11`() {
        val s = "aaaabbbbcccc"
        assertThat(sut.minDeletions(s), `is`(3))
    }

    @Test
    fun `example 12`() {
        val s = "aaaabbbccd"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 13`() {
        val s = "bbcebab"
        assertThat(sut.minDeletions(s), `is`(2))
    }

    @Test
    fun `example 14`() {
        val s = "accdcdadddbaadbc"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 15`() {
        val s = "abcdefghijklmnopqrstuvwxyz"
        assertThat(sut.minDeletions(s), `is`(25))
    }

    @Test
    fun `example 16`() {
        val s = "zzzzz"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 17`() {
        val s = "aaaaabbbbbccccc"
        assertThat(sut.minDeletions(s), `is`(3))
    }

    @Test
    fun `example 18`() {
        val s = "abbccc"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 19`() {
        val s = "aabbccdd"
        assertThat(sut.minDeletions(s), `is`(5))
    }

    @Test
    fun `example 20`() {
        val s = "leetcode"
        assertThat(sut.minDeletions(s), `is`(4))
    }

    @Test
    fun `example 21`() {
        val s = "mississippi"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 22`() {
        val s = "programming"
        assertThat(sut.minDeletions(s), `is`(8))
    }

    @Test
    fun `example 23`() {
        val s = "aaaaaaaaab"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 24`() {
        val s = "abacabad"
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 25`() {
        val s = "abcd"
        assertThat(sut.minDeletions(s), `is`(3))
    }

    @Test
    fun `example 26`() {
        val s = "aaabbbccc"
        assertThat(sut.minDeletions(s), `is`(3))
    }

    @Test
    fun `example 27`() {
        val s = "banana"
        assertThat(sut.minDeletions(s), `is`(0))
    }

    // s.length가 최대(10^5)인 경우
    @Test
    fun `example 28`() {
        val s = "a".repeat(100_000)
        assertThat(sut.minDeletions(s), `is`(0))
    }

    @Test
    fun `example 29`() {
        val s = "ab".repeat(50_000)
        assertThat(sut.minDeletions(s), `is`(1))
    }

    @Test
    fun `example 30`() {
        val s = "abcdefghijklmnopqrstuvwxyz".repeat(3846) + "abcd"
        assertThat(sut.minDeletions(s), `is`(303))
    }
}
