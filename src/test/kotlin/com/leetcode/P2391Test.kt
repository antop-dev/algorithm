package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2391Test {
    val sut = P2391()

    @Test
    fun `example 1`() {
        val garbage = arrayOf("G", "P", "GP", "GG")
        val travel = intArrayOf(2, 4, 3)
        assertThat(sut.garbageCollection(garbage, travel), `is`(21))
    }

    @Test
    fun `example 2`() {
        val garbage = arrayOf("MMM", "PGM", "GP")
        val travel = intArrayOf(3, 10)
        assertThat(sut.garbageCollection(garbage, travel), `is`(37))
    }

    @Test
    fun `example 3`() {
        val garbage = arrayOf("G", "M")
        val travel = intArrayOf(1)
        assertThat(sut.garbageCollection(garbage, travel), `is`(3))
    }
}
