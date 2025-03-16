package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1415Test {
    val sut = P1415()

    @Test
    fun `example 1`() {
        assertThat(sut.getHappyString(1,3), `is`("c"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.getHappyString(1,4), `is`(""))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.getHappyString(3,9), `is`("cab"))
    }
}
