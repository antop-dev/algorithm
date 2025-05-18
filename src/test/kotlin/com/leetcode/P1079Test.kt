package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1079Test {
    val sut = P1079()

    @Test
    fun `example 1`() {
        assertThat(sut.numTilePossibilities("AAB"), `is`(8))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numTilePossibilities("AAABBC"), `is`(188))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numTilePossibilities("V"), `is`(1))
    }
}