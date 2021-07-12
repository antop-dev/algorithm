package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P131Test {
    val p = P131()

    @Test
    fun `example 01`() {
        assertThat(
            p.partition(s = "aab"),
            `is`(listOf(listOf("a", "a", "b"), listOf("aa", "b")))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.partition(s = "a"),
            `is`(listOf(listOf("a")))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.partition(s = "efe"),
            `is`(listOf(listOf("e", "f", "e"), listOf("efe")))
        )
    }

}
