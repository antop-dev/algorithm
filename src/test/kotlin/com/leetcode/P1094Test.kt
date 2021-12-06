package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1094Test {
    val p = P1094()

    @Test
    fun `example 01`() {
        assertThat(p.carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 4), `is`(false))
    }

    @Test
    fun `example 02`() {
        assertThat(p.carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 5), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 5, 7)), 3), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.carPooling(
                arrayOf(
                    intArrayOf(3, 2, 7),
                    intArrayOf(3, 7, 9),
                    intArrayOf(8, 3, 9)
                ), 11
            ), `is`(true)
        )
    }

}
