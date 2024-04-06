package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P386Test {
    val sut = P386()

    @Test
    fun `example 1`() {
        assertThat(sut.lexicalOrder(13), `is`(listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.lexicalOrder(2), `is`(listOf(1, 2)))
    }

}
