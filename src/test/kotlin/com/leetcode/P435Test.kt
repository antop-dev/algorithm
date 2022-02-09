package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P435Test {
    val p = P435()

    @Test
    fun `example 01`() {
        assertThat(
            p.eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3))),
            `is`(1)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))),
            `is`(2)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))),
            `is`(0)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 100),
                    intArrayOf(11, 22),
                    intArrayOf(1, 11),
                    intArrayOf(2, 12)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(-52, 31),
                    intArrayOf(-73, -26),
                    intArrayOf(82, 97),
                    intArrayOf(-65, -11),
                    intArrayOf(-62, -49),
                    intArrayOf(95, 99),
                    intArrayOf(58, 95),
                    intArrayOf(-31, 49),
                    intArrayOf(66, 98),
                    intArrayOf(-63, 2),
                    intArrayOf(30, 47),
                    intArrayOf(-40, -26)
                )
            ),
            `is`(7)
        )
    }

}
