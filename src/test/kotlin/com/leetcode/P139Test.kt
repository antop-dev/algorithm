package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P139Test {
    val p = P139()

    @Test
    fun `example 01`() {
        assertThat(p.wordBreak("leetcode", listOf("leet", "code")), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.wordBreak("applepenapple", listOf("apple", "pen")), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")), `is`(false))
    }

    @Test
    fun `example 04`() {
        // cat and dog
        assertThat(p.wordBreak("catanddog", listOf("cata", "ddog", "an", "and", "cat")), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.wordBreak("cars", listOf("car", "ca", "rs")), `is`(true)
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.wordBreak(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                listOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
            ), `is`(false)
        )
    }

}
