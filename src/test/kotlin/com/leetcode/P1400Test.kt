package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1400Test {
    val sut = P1400()

    @Test
    fun `example 1`() {
        assertThat(sut.canConstruct("annabelle", 2), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.canConstruct("leetcode", 3), `is`(false))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.canConstruct("true", 4), `is`(true))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.canConstruct("cr", 7), `is`(false))
    }
}