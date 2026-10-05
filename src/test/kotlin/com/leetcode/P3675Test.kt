package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3675Test {
    private val sut = P3675()

    @Test
    fun `example 01`() {
        val s = "yz"
        assertThat(sut.minOperations(s), `is`(2))
    }

    @Test
    fun `example 02`() {
        val s = "a"
        assertThat(sut.minOperations(s), `is`(0))
    }

    // s.length가 최소(1)인 경우
    @Test
    fun `example 03`() {
        val s = "b"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 04`() {
        val s = "z"
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 05`() {
        val s = "aaaa"
        assertThat(sut.minOperations(s), `is`(0))
    }

    @Test
    fun `example 06`() {
        val s = "az"
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 07`() {
        val s = "ba"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 08`() {
        val s = "abc"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 09`() {
        val s = "zzz"
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 10`() {
        val s = "zyx"
        assertThat(sut.minOperations(s), `is`(3))
    }

    @Test
    fun `example 11`() {
        val s = "bcd"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 12`() {
        val s = "mnop"
        assertThat(sut.minOperations(s), `is`(14))
    }

    @Test
    fun `example 13`() {
        val s = "abcdefghijklmnopqrstuvwxyz"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 14`() {
        val s = "azazaz"
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 15`() {
        val s = "hello"
        assertThat(sut.minOperations(s), `is`(22))
    }

    @Test
    fun `example 16`() {
        val s = "leetcode"
        assertThat(sut.minOperations(s), `is`(24))
    }

    @Test
    fun `example 17`() {
        val s = "aaab"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 18`() {
        val s = "yyyy"
        assertThat(sut.minOperations(s), `is`(2))
    }

    @Test
    fun `example 19`() {
        val s = "qwerty"
        assertThat(sut.minOperations(s), `is`(22))
    }

    @Test
    fun `example 20`() {
        val s = "bbbbz"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 21`() {
        val s = "c"
        assertThat(sut.minOperations(s), `is`(24))
    }

    @Test
    fun `example 22`() {
        val s = "zab"
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 23`() {
        val s = "xyz"
        assertThat(sut.minOperations(s), `is`(3))
    }

    @Test
    fun `example 24`() {
        val s = "nnnn"
        assertThat(sut.minOperations(s), `is`(13))
    }

    @Test
    fun `example 25`() {
        val s = "aazz"
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 26`() {
        val s = "kotlin"
        assertThat(sut.minOperations(s), `is`(18))
    }

    // s.length가 최대(5 * 10^5)인 경우
    @Test
    fun `example 27`() {
        val s = "a".repeat(500_000)
        assertThat(sut.minOperations(s), `is`(0))
    }

    @Test
    fun `example 28`() {
        val s = "z".repeat(500_000)
        assertThat(sut.minOperations(s), `is`(1))
    }

    @Test
    fun `example 29`() {
        val s = "b".repeat(500_000)
        assertThat(sut.minOperations(s), `is`(25))
    }

    @Test
    fun `example 30`() {
        val s = "a".repeat(499_999) + "b"
        assertThat(sut.minOperations(s), `is`(25))
    }
}
