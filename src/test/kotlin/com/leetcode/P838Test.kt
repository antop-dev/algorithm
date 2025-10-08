package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P838Test {
    val sut = P838()

    @Test
    fun `example 1`() {
        assertThat(sut.pushDominoes("RR.L"), `is`("RR.L"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.pushDominoes(".L.R...LR..L.."), `is`("LL.RR.LLRRLL.."))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.pushDominoes("RRRRRRRRR.LL"), `is`("RRRRRRRRR.LL"))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.pushDominoes("......L"), `is`("LLLLLLL"))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.pushDominoes(".....LR...."), `is`("LLLLLLRRRRR"))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.pushDominoes("L..L..L.."), `is`("LLLLLLL.."))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.pushDominoes("RLRLRL"), `is`("RLRLRL"))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.pushDominoes("R.R.L"), `is`("RRR.L"))
    }

}