package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P647Test {
    val p = P647()

    @Test
    fun `example 01`() {
        assertThat(p.countSubstrings("abc"), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.countSubstrings("aaa"), `is`(6))
    }

    @Test
    fun `example 03`() {
        assertThat(p.countSubstrings("abaaca"), `is`(9))
    }

}
