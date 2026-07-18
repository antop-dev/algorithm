package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2101Test {
    private val p = P2101()

    @Test
    fun `example 01`() {
        assertThat(p.maximumDetonation(arrayOf(intArrayOf(2, 1, 3), intArrayOf(6, 1, 4))), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maximumDetonation(arrayOf(intArrayOf(1, 1, 5), intArrayOf(10, 10, 5))), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.maximumDetonation(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 4, 2),
                    intArrayOf(4, 5, 3),
                    intArrayOf(5, 6, 4)
                )
            ),
            `is`(5)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.maximumDetonation(
                arrayOf(
                    intArrayOf(1, 1, 100000),
                    intArrayOf(100000, 100000, 1),
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.maximumDetonation(
                arrayOf(
                    intArrayOf(38496, 37528, 4845),
                    intArrayOf(46272, 98187, 1365),
                    intArrayOf(70550, 7578, 3223),
                    intArrayOf(77200, 18005, 7272),
                    intArrayOf(7648, 58155, 7628),
                    intArrayOf(95708, 33470, 1889),
                    intArrayOf(20157, 92266, 9823),
                    intArrayOf(52803, 2765, 6751),
                    intArrayOf(50429, 63049, 3002),
                    intArrayOf(72582, 69729, 2281),
                    intArrayOf(49317, 35327, 1922),
                    intArrayOf(715, 8902, 9620),
                    intArrayOf(21154, 58349, 8544),
                    intArrayOf(43935, 46296, 6868),
                    intArrayOf(7881, 24144, 2372),
                    intArrayOf(95258, 97730, 6554),
                    intArrayOf(5525, 56971, 9191),
                    intArrayOf(95762, 81415, 2027),
                    intArrayOf(62518, 75469, 1330),
                    intArrayOf(83660, 4341, 6817),
                    intArrayOf(30268, 38781, 8309),
                    intArrayOf(97922, 20474, 4047),
                    intArrayOf(39466, 40057, 2061),
                    intArrayOf(91983, 24242, 5451),
                    intArrayOf(92380, 31509, 8446),
                    intArrayOf(12436, 8897, 5279),
                    intArrayOf(28386, 8556, 4702),
                    intArrayOf(54672, 88180, 1106),
                    intArrayOf(17843, 95337, 4420),
                    intArrayOf(21956, 49924, 1839)
                )
            ),
            `is`(3)
        )
    }
}
