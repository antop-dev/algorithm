package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2109Test {
    val sut = P2109()

    @Test
    fun `example 1`() {
        assertThat(
            sut.addSpaces("LeetcodeHelpsMeLearn", intArrayOf(8, 13, 15)),
            `is`("Leetcode Helps Me Learn")
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.addSpaces("icodeinpython", intArrayOf(1, 5, 7, 9)),
            `is`("i code in py thon")
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6)),
            `is`(" s p a c i n g")
        )
    }
}
