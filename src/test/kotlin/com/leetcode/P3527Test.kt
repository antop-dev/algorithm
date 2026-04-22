package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3527Test {
    private val sut = P3527()

    @Test
    fun `example 1`() {
        val responses = arrayOf(
            arrayOf("good", "ok", "good", "ok"),
            arrayOf("ok", "bad", "good", "ok", "ok"),
            arrayOf("good"),
            arrayOf("bad"),
        )
        assertThat(sut.mostCommonResponse(responses), `is`("good"))
    }

    @Test
    fun `example 2`() {
        val responses = arrayOf(
            arrayOf("good", "ok", "good"),
            arrayOf("ok", "bad"),
            arrayOf("bad", "notsure"),
            arrayOf("great", "good"),
        )
        assertThat(sut.mostCommonResponse(responses), `is`("bad"))
    }

    @Test
    fun `example 3`() {
        val responses = arrayOf(
            arrayOf("sj", "jec", "jec", "gvm", "db"),
            arrayOf("h", "jec", "vqgt", "k", "a", "jec", "u", "s"),
        )
        assertThat(sut.mostCommonResponse(responses), `is`("jec"))
    }
}
