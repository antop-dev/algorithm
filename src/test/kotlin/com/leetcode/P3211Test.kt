package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P3211Test {
    val sut = P3211()

    @Test
    fun `example 1`() {
        assertThat(
            sut.validStrings(3),
            containsInAnyOrder("010", "011", "101", "110", "111")
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.validStrings(1),
            containsInAnyOrder("0", "1")
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.validStrings(2),
            containsInAnyOrder("01", "10", "11")
        )
    }
}
