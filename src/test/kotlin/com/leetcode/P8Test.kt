package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P8Test {
    val p = P8()

    @Test
    fun example01() {
        assertThat(p.myAtoi("42"), `is`(42))
    }

    @Test
    fun example02() {
        assertThat(p.myAtoi("   -42"), `is`(-42))
    }

    @Test
    fun example03() {
        assertThat(p.myAtoi("4193 with words"), `is`(4193))
    }

    @Test
    fun example04() {
        assertThat(p.myAtoi("words and 987"), `is`(0))
    }

    @Test
    fun example05() {
        assertThat(p.myAtoi("-91283472332"), `is`(-2147483648))
    }

}
