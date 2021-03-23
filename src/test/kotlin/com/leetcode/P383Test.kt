package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P383Test {
    val p = P383()

    @Test
    fun `example 01`() {
        assertThat(p.canConstruct("a", "b"), `is`(false))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canConstruct("aa", "bb"), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.canConstruct("aa", "aab"), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.canConstruct("aab", "baa"), `is`(true))
    }

}
