package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P345Test {
    val p = P345()

    @Test
    fun `example 01`() {
        assertThat(p.reverseVowels("hello"), `is`("holle"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.reverseVowels("leetcode"), `is`("leotcede"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.reverseVowels("aA"), `is`("Aa"))
    }

}
