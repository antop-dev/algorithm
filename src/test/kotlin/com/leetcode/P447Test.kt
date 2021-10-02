package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P447Test {
    val p = P447()

    @Test
    fun `example 01`() {
        assertThat(
            p.numberOfBoomerangs(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(1, 0),
                    intArrayOf(2, 0)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.numberOfBoomerangs(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.numberOfBoomerangs(arrayOf(intArrayOf(1, 1))),
            `is`(0)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.numberOfBoomerangs(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(1, 0),
                    intArrayOf(-1, 0),
                    intArrayOf(0, 1),
                    intArrayOf(0, -1)
                )
            ),
            `is`(20)
        )
    }
}
