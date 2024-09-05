package com.leetcode

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class P649Test : AnnotationSpec() {
    val sut = P649()

    @Test
    fun `example 1`() {
        sut.predictPartyVictory("RD") shouldBe "Radiant"
    }

    @Test
    fun `example 2`() {
        sut.predictPartyVictory("RDD") shouldBe "Dire"
    }

    @Test
    fun `example 3`() {
        sut.predictPartyVictory("RRRDDD") shouldBe "Radiant"
    }

    @Test
    fun `example 4`() {
        sut.predictPartyVictory("DDDRRR") shouldBe "Dire"
    }

    @Test
    fun `example 5`() {
        sut.predictPartyVictory("RDRDRD") shouldBe "Radiant"
    }

    @Test
    fun `example 6`() {
        sut.predictPartyVictory("DRDRDR") shouldBe "Dire"
    }

    @Test
    fun `example 7`() {
        sut.predictPartyVictory("DDDRRRR") shouldBe "Dire"
    }

    @Test
    fun `example 8`() {
        sut.predictPartyVictory("DDDRRRRR") shouldBe "Radiant"
    }

    @Test
    fun `example 9`() {
        sut.predictPartyVictory("RRDDD") shouldBe "Radiant"
    }
}
