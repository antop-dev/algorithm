package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2400Test {
    val sut = P2400()

    @Test
    fun `example 1`() {
        assertThat(sut.numberOfWays(1, 2, 3), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numberOfWays(2, 5, 10), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numberOfWays(264, 198, 68), `is`(68))
    }
}
