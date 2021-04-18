package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1347Test {
    val p = P1347()

    @Test
    fun `example 01`() {
        assertThat(p.minSteps("bab", "aba"), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minSteps("leetcode", "practice"), `is`(5))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minSteps("anagram", "mangaar"), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minSteps("xxyyzz", "xxyyzz"), `is`(0))
    }

    @Test
    fun `example 05`() {
        assertThat(p.minSteps("friend", "family"), `is`(4))
    }

}
