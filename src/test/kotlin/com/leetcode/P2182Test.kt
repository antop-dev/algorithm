package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2182Test {
    val sut = P2182()

    @Test
    fun `example 1`() {
        assertThat(sut.repeatLimitedString("cczazcc", 3), `is`("zzcccac"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.repeatLimitedString("aababab", 2), `is`("bbabaa"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.repeatLimitedString("zzzzaaaaaaaaaaaaaaa", 3), `is`("zzzazaaa"))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.repeatLimitedString("abcaaaaaaaaaa", 3), `is`("cbaaa"))
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.repeatLimitedString("xyutfpopdynbadwtvmxiemmusevduloxwvpkjioizvanetecnuqbqqdtrwrkgt", 1),
            `is`("zyxyxwxwvwvuvuvututstrtrtqpqpqponononmlmkmkjigifiededededcbaba")
        )
    }
}
