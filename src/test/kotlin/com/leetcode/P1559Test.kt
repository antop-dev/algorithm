package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1559Test {
    val sut = P1559()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            charArrayOf('a', 'a', 'a', 'a'),
            charArrayOf('a', 'b', 'b', 'a'),
            charArrayOf('a', 'b', 'b', 'a'),
            charArrayOf('a', 'a', 'a', 'a'),
        )
        assertThat(sut.containsCycle(grid), `is`(true))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            charArrayOf('c', 'c', 'c', 'a'),
            charArrayOf('c', 'd', 'c', 'c'),
            charArrayOf('c', 'c', 'e', 'c'),
            charArrayOf('f', 'c', 'c', 'c'),
        )
        assertThat(sut.containsCycle(grid), `is`(true))
    }

    @Test
    fun `example 3`() {
        val grid = arrayOf(
            charArrayOf('a', 'b', 'b'),
            charArrayOf('b', 'z', 'b'),
            charArrayOf('b', 'b', 'a'),
        )
        assertThat(sut.containsCycle(grid), `is`(false))
    }

    @Test
    fun `example 4`() {
        val grid = arrayOf(
            charArrayOf('a', 'a'),
            charArrayOf('a', 'b'),
        )
        assertThat(sut.containsCycle(grid), `is`(false))
    }

    @Test
    fun `example 5`() {
        val grid = arrayOf(
            charArrayOf('c', 'a', 'd'),
            charArrayOf('a', 'a', 'a'),
            charArrayOf('a', 'a', 'd'),
            charArrayOf('a', 'c', 'd'),
            charArrayOf('a', 'b', 'c'),
        )
        assertThat(sut.containsCycle(grid), `is`(true))
    }

    @Test
    fun `example 6`() {
        val grid = arrayOf(
            charArrayOf('b', 'a', 'c'),
            charArrayOf('c', 'a', 'c'),
            charArrayOf('d', 'd', 'c'),
            charArrayOf('b', 'c', 'c'),
        )
        assertThat(sut.containsCycle(grid), `is`(false))
    }
}