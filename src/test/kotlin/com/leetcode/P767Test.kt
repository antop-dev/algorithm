package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.anyOf
import org.junit.jupiter.api.Test

class P767Test {
    val p = P767()

    @Test
    fun `example 01`() {
        assertThat(p.reorganizeString("aab"), `is`("aba"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.reorganizeString("aaab"), `is`(""))
    }

    @Test
    fun `example 03`() {
        assertThat(p.reorganizeString("vvvlo"), anyOf(`is`("vlvov"), `is`("vovlv")))
    }

    @Test
    fun `example 04`() {
        assertThat(p.reorganizeString("baaba"), `is`("ababa"))
    }

}
