package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P779Test {
    val p = P779()

    @Test
    fun `example 01`() {
        assertThat(p.kthGrammar(1, 1), `is`(0))
    }

    @Test
    fun `example 02`() {
        assertThat(p.kthGrammar(2, 1), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.kthGrammar(2, 2), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.kthGrammar(4, 5), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(p.kthGrammar(3, 1), `is`(0))
    }

}
