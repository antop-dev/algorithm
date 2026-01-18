package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3746Test {
    val sut = P3746()

    @Test
    fun `example 1`() {
        assertThat(sut.minLengthAfterRemovals("aabbab"), `is`(0))
    }


    @Test
    fun `example 2`() {
        assertThat(sut.minLengthAfterRemovals("aaaa"), `is`(4))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minLengthAfterRemovals("aaabb"), `is`(1))
    }
}
