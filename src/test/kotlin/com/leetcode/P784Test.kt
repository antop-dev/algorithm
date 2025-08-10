package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P784Test {
    val sut = P784()

    @Test
    fun `example 1`() {
        assertThat(
            sut.letterCasePermutation("a1b2"),
            containsInAnyOrder("a1b2", "a1B2", "A1b2", "A1B2")
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.letterCasePermutation("3z4"),
            containsInAnyOrder("3z4", "3Z4")
        )
    }

}