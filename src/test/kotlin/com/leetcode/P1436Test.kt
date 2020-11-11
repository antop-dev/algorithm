package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1436Test {
    val p = P1436()

    @Test
    fun `example 01`() {
        val paths = listOf(
            listOf("London", "New York"),
            listOf("New York", "Lima"),
            listOf("Lima", "Sao Paulo")
        )
        assertThat(p.destCity(paths), `is`("Sao Paulo"))
    }

    @Test
    fun `example 02`() {
        val paths = listOf(
            listOf("B", "C"),
            listOf("D", "B"),
            listOf("C", "A")
        )
        assertThat(p.destCity(paths), `is`("A"))
    }

    @Test
    fun `example 03`() {
        val paths = listOf(
            listOf("A", "Z")
        )
        assertThat(p.destCity(paths), `is`("Z"))
    }
}
