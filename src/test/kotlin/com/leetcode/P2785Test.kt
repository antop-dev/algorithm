package com.leetcode

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

class P2785Test {
    val sut = P2785()

    @Test
    fun `example 1`() {
        MatcherAssert.assertThat(sut.sortVowels("lEetcOde"), Matchers.`is`("lEOtcede"))
    }

    @Test
    fun `example 2`() {
        MatcherAssert.assertThat(sut.sortVowels("lYmpH"), Matchers.`is`("lYmpH"))
    }

}