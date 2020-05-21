package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P459Test {
    val p = P459()

    @Test
    fun `example 1`() {
        // ab
        assertThat("It's the substring \"ab\" twice.",
                p.repeatedSubstringPattern("abab"),
                `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(p.repeatedSubstringPattern("aba"), `is`(false))
    }

    @Test
    fun `example 3`() {
        // abc, abcabc
        assertThat("It's the substring \"abc\" four times. (And the substring \"abcabc\" twice.)",
                p.repeatedSubstringPattern("abcabcabcabc"),
                `is`(true))
    }

    @Test
    fun `example 4`() {
        // abaab
        assertThat(p.repeatedSubstringPattern("abaababaab"),
                `is`(true))
    }

}
