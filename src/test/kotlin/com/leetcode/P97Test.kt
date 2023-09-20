package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P97Test {
    val sut = P97()

    @Test
    fun `example 1`() {
        assertThat(sut.isInterleave("aabcc", "dbbca", "aadbbcbcac"), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.isInterleave("aabcc", "dbbca", "aadbbbaccc"), `is`(false))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.isInterleave("", "", ""), `is`(true))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.isInterleave("aaaaa", "aaa", "aaaaaaaa"), `is`(true))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.isInterleave("aaa", "bbb", "ababab"), `is`(true))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.isInterleave("aabc", "abad", "aabadabc"), `is`(true))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.isInterleave("", "a", ""), `is`(false))
    }

    @Test
    fun `example 8`() {
        assertThat(
            sut.isInterleave(
                "abababababababababababababababababababababababababababababababababababababababababababababababababbb",
                "babababababababababababababababababababababababababababababababababababababababababababababababaaaba",
                "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababbb"
            ),
            `is`(false)
        )
    }

}
