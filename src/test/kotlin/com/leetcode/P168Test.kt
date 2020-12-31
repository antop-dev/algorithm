package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P168Test {
    val p = P168()

    @Test
    fun `example 01`() {
        assertThat(p.convertToTitle(1), `is`("A"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.convertToTitle(28), `is`("AB"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.convertToTitle(701), `is`("ZY"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.convertToTitle(26), `is`("Z"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.convertToTitle(702), `is`("ZZ"))
    }

    @Test
    fun `example 06`() {
        assertThat(p.convertToTitle(703), `is`("AAA"))
    }

}


