package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1910Test {
    val sut = P1910()

    @Test
    fun `example 01`() {
        assertThat(sut.removeOccurrences("daabcbaabcbc", "abc"), `is`("dab"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.removeOccurrences("axxxxyyyyb", "xy"), `is`("ab"))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.removeOccurrences("aabababa", "aba"), `is`("ba"))
    }


}
