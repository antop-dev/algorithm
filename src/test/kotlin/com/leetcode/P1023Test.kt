package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1023Test {
    val sut = P1023()

    @Test
    fun `example 1`() {
        val queries = arrayOf("FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack")
        val pattern = "FB"
        val expected = listOf(true, false, true, true, false)
        assertThat(sut.camelMatch(queries, pattern), `is`(expected))
    }

    @Test
    fun `example 2`() {
        val queries = arrayOf("FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack")
        val pattern = "FoBa"
        val expected = listOf(true, false, true, false, false)
        assertThat(sut.camelMatch(queries, pattern), `is`(expected))
    }

    @Test
    fun `example 3`() {
        val queries = arrayOf("FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack")
        val pattern = "FoBaT"
        val expected = listOf(false, true, false, false, false)
        assertThat(sut.camelMatch(queries, pattern), `is`(expected))
    }

    @Test
    fun `example 4`() {
        val queries = arrayOf("FooBar")
        val pattern = "FBCAZXCVVNM"
        val expected = listOf(false)
        assertThat(sut.camelMatch(queries, pattern), `is`(expected))
    }

    @Test
    fun `example 5`() {
        val queries = arrayOf("FooBar")
        val pattern = "FC"
        val expected = listOf(false)
        assertThat(sut.camelMatch(queries, pattern), `is`(expected))
    }
}
