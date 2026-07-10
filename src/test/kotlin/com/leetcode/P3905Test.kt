package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3905Test {
    private val sut = P3905()

    @Test
    fun `example 1`() {
        val sources = arrayOf(intArrayOf(0, 0, 1), intArrayOf(2, 2, 2))
        assertThat(
            sut.colorGrid(3, 3, sources),
            `is`(arrayOf(intArrayOf(1, 1, 2), intArrayOf(1, 2, 2), intArrayOf(2, 2, 2)))
        )
    }

    @Test
    fun `example 2`() {
        val sources = arrayOf(intArrayOf(0, 1, 3), intArrayOf(1, 1, 5))
        assertThat(
            sut.colorGrid(3, 3, sources),
            `is`(arrayOf(intArrayOf(3, 3, 3), intArrayOf(5, 5, 5), intArrayOf(5, 5, 5)))
        )
    }

    @Test
    fun `example 3`() {
        val sources = arrayOf(intArrayOf(1, 1, 5))
        assertThat(sut.colorGrid(2, 2, sources), `is`(arrayOf(intArrayOf(5, 5), intArrayOf(5, 5))))
    }
}
