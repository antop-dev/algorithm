package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P649Test {
    val sut = P649()

    @Test
    fun `example 1`() {
        assertThat(sut.predictPartyVictory("RD"), `is`("Radiant"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.predictPartyVictory("RDD"), `is`("Dire"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.predictPartyVictory("RRRDDD"), `is`("Radiant"))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.predictPartyVictory("DDDRRR"), `is`("Dire"))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.predictPartyVictory("RDRDRD"), `is`("Radiant"))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.predictPartyVictory("DRDRDR"), `is`("Dire"))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.predictPartyVictory("DDDRRRR"), `is`("Dire"))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.predictPartyVictory("DDDRRRRR"), `is`("Radiant"))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.predictPartyVictory("RRDDD"), `is`("Radiant"))
    }
}
