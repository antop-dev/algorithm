package com.codewars

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2785Test {
    val sut = P2785()

    @Test
    fun `example 1`() {
        assertThat(sut.sortVowels("lEetcOde"), `is`("lEOtcede"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.sortVowels("lYmpH"), `is`("lYmpH"))
    }

}
