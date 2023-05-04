package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P424Test {
    val sut = P424()

    @Test
    fun `example 1`() {
        assertThat(sut.characterReplacement("ABAB", 2), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.characterReplacement("AABABBA", 1), `is`(4))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.characterReplacement("AAABAABAAAAAA", 1), `is`(9))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.characterReplacement("ABCDEF", 2), `is`(3))
    }

}
