package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.isIn
import org.junit.jupiter.api.Test

class P984Test {
    val sut = P984()

    @Test
    fun `example 1`() {
        assertThat(sut.strWithout3a3b(1, 2), isIn(arrayOf("abb", "bab", "bba")))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.strWithout3a3b(4, 1), isIn(arrayOf("aabaa")))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.strWithout3a3b(0, 0), `is`(""))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.strWithout3a3b(1, 0), `is`("a"))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.strWithout3a3b(2, 0), `is`("aa"))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.strWithout3a3b(0, 1), `is`("b"))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.strWithout3a3b(0, 2), `is`("bb"))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.strWithout3a3b(1, 1), isIn(arrayOf("ab", "ba")))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.strWithout3a3b(2, 5), isIn(arrayOf("babbabb", "bbabbab")))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.strWithout3a3b(4, 4), isIn(arrayOf("abababab", "babababa")))
    }
}
