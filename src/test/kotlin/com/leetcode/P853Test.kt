package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P853Test {
    val p = P853()

    @Test
    fun `example 01`() {
        assertThat(
            p.carFleet(
                12,
                intArrayOf(10, 8, 0, 5, 3),
                intArrayOf(2, 4, 1, 1, 3)
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.carFleet(
                10,
                intArrayOf(0, 4, 2),
                intArrayOf(2, 1, 3)
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.carFleet(
                10,
                intArrayOf(8, 3, 7, 4, 6, 5),
                intArrayOf(4, 4, 4, 4, 4, 4)
            ),
            `is`(6)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.carFleet(
                20,
                intArrayOf(6, 2, 17),
                intArrayOf(3, 9, 2)
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.carFleet(
                16,
                intArrayOf(11, 14, 13, 6),
                intArrayOf(2, 2, 6, 7)
            ),
            `is`(2)
        )
    }

}
