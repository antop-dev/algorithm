package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3775Test {
    private val sut = P3775()

    @Test
    fun `example 01`() {
        val s = "cat and mice"
        assertThat(sut.reverseWords(s), `is`("cat dna mice"))
    }

    @Test
    fun `example 02`() {
        val s = "book is nice"
        assertThat(sut.reverseWords(s), `is`("book is ecin"))
    }

    @Test
    fun `example 03`() {
        val s = "banana healthy"
        assertThat(sut.reverseWords(s), `is`("banana healthy"))
    }

    // s가 최소 길이(1)인 경우
    @Test
    fun `example 04`() {
        val s = "a"
        assertThat(sut.reverseWords(s), `is`("a"))
    }

    @Test
    fun `example 05`() {
        val s = "b"
        assertThat(sut.reverseWords(s), `is`("b"))
    }

    @Test
    fun `example 06`() {
        val s = "abc def"
        assertThat(sut.reverseWords(s), `is`("abc fed"))
    }

    @Test
    fun `example 07`() {
        val s = "xyz bcd"
        assertThat(sut.reverseWords(s), `is`("xyz dcb"))
    }

    @Test
    fun `example 08`() {
        val s = "xyz a"
        assertThat(sut.reverseWords(s), `is`("xyz a"))
    }

    @Test
    fun `example 09`() {
        val s = "hello world"
        assertThat(sut.reverseWords(s), `is`("hello world"))
    }

    @Test
    fun `example 10`() {
        val s = "aeiou uoiea aeiou"
        assertThat(sut.reverseWords(s), `is`("aeiou aeiou uoiea"))
    }

    @Test
    fun `example 11`() {
        val s = "the quick brown fox"
        assertThat(sut.reverseWords(s), `is`("the quick nworb xof"))
    }

    @Test
    fun `example 12`() {
        val s = "a b c d"
        assertThat(sut.reverseWords(s), `is`("a b c d"))
    }

    @Test
    fun `example 13`() {
        val s = "a e i o"
        assertThat(sut.reverseWords(s), `is`("a e i o"))
    }

    @Test
    fun `example 14`() {
        val s = "ab ba"
        assertThat(sut.reverseWords(s), `is`("ab ab"))
    }

    @Test
    fun `example 15`() {
        val s = "rhythm myth gym"
        assertThat(sut.reverseWords(s), `is`("rhythm htym myg"))
    }

    @Test
    fun `example 16`() {
        val s = "level stats"
        assertThat(sut.reverseWords(s), `is`("level stats"))
    }

    @Test
    fun `example 17`() {
        val s = "programming is fun"
        assertThat(sut.reverseWords(s), `is`("programming is fun"))
    }

    @Test
    fun `example 18`() {
        val s = "code node mode"
        assertThat(sut.reverseWords(s), `is`("code edon edom"))
    }

    @Test
    fun `example 19`() {
        val s = "apple"
        assertThat(sut.reverseWords(s), `is`("apple"))
    }

    @Test
    fun `example 20`() {
        val s = "zz zz zz"
        assertThat(sut.reverseWords(s), `is`("zz zz zz"))
    }

    @Test
    fun `example 21`() {
        val s = "one two three four"
        assertThat(sut.reverseWords(s), `is`("one two eerht ruof"))
    }

    @Test
    fun `example 22`() {
        val s = "sky fly try"
        assertThat(sut.reverseWords(s), `is`("sky ylf yrt"))
    }

    @Test
    fun `example 23`() {
        val s = "moon soon noon"
        assertThat(sut.reverseWords(s), `is`("moon noos noon"))
    }

    @Test
    fun `example 24`() {
        val s = "a ab abc abcd"
        assertThat(sut.reverseWords(s), `is`("a ba cba dcba"))
    }

    @Test
    fun `example 25`() {
        val s = "queue bee"
        assertThat(sut.reverseWords(s), `is`("queue bee"))
    }

    @Test
    fun `example 26`() {
        val s = "cat dog pig"
        assertThat(sut.reverseWords(s), `is`("cat god gip"))
    }

    @Test
    fun `example 27`() {
        val s = "stressed desserts"
        assertThat(sut.reverseWords(s), `is`("stressed stressed"))
    }

    // s가 최대 길이(100000)인 단일 단어인 경우
    @Test
    fun `example 28`() {
        val s = "a".repeat(100000)
        assertThat(sut.reverseWords(s), `is`("a".repeat(100000)))
    }

    // 단어가 가장 많은 경우 - 모두 뒤집힘
    @Test
    fun `example 29`() {
        val s = List(33333) { "ab" }.joinToString(" ")
        assertThat(sut.reverseWords(s), `is`(List(33333) { if (it == 0) "ab" else "ba" }.joinToString(" ")))
    }

    // 단어가 가장 많은 경우 - 모두 그대로
    @Test
    fun `example 30`() {
        val s = (listOf("bc") + List(33332) { "ab" }).joinToString(" ")
        assertThat(sut.reverseWords(s), `is`((listOf("bc") + List(33332) { "ab" }).joinToString(" ")))
    }
}
