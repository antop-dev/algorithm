package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1042Test {
    val p = P1042()

    @Test
    fun `example 1`() {
        assertThat(p.gardenNoAdj(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1))),
                `is`(intArrayOf(1, 2, 3))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(p.gardenNoAdj(4, arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))),
                `is`(intArrayOf(1, 2, 1, 2))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(p.gardenNoAdj(4, arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 1),
                intArrayOf(1, 3),
                intArrayOf(2, 4)
        )),
                `is`(intArrayOf(1, 2, 3, 4))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(p.gardenNoAdj(5, arrayOf(
                intArrayOf(4, 1),
                intArrayOf(4, 2),
                intArrayOf(4, 3),
                intArrayOf(2, 5),
                intArrayOf(1, 2),
                intArrayOf(1, 5)
        )),
                `is`(intArrayOf(1, 2, 1, 3, 3))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(p.gardenNoAdj(7, arrayOf(
                intArrayOf(2, 4),
                intArrayOf(7, 1),
                intArrayOf(3, 2),
                intArrayOf(6, 1),
                intArrayOf(7, 2),
                intArrayOf(3, 6),
                intArrayOf(4, 1),
                intArrayOf(3, 7),
                intArrayOf(4, 5)
        )),
                `is`(intArrayOf(1, 1, 2, 2, 1, 3, 3))
        )
    }

    @Test
    fun `example 6`() {
        assertThat(p.gardenNoAdj(1, emptyArray()),
                `is`(intArrayOf(1))
        )
    }

    @Test
    fun `example 7`() {
        assertThat(p.gardenNoAdj(10, emptyArray()),
                `is`(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1))
        )
    }

}