package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P43162Test {
    val p = P43162()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                3, arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                3,
                arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 1),
                    intArrayOf(0, 1, 1)
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(1, arrayOf(intArrayOf(1))),
            `is`(1)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.solution(
                2,
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(0, 1)
                )
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.solution(
                2,
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.solution(
                4,
                arrayOf(
                    intArrayOf(1, 1, 0, 1),
                    intArrayOf(1, 1, 0, 0),
                    intArrayOf(0, 0, 1, 1),
                    intArrayOf(1, 0, 1, 1)
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 07`() {
        assertThat(
            p.solution(
                4,
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(0, 0, 1, 0),
                    intArrayOf(0, 0, 0, 1)
                )
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 08`() {
        assertThat(
            p.solution(
                6,
                arrayOf(
                    intArrayOf(1, 0, 1, 1, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1),
                    intArrayOf(1, 0, 1, 1, 1, 1),
                    intArrayOf(1, 0, 1, 1, 1, 1),
                    intArrayOf(0, 1, 1, 1, 1, 1),
                    intArrayOf(0, 1, 1, 1, 1, 1)
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 09`() {
        assertThat(
            p.solution(
                5,
                arrayOf(
                    intArrayOf(1, 1, 0, 0, 1),
                    intArrayOf(0, 1, 1, 0, 0),
                    intArrayOf(0, 1, 1, 1, 0),
                    intArrayOf(0, 0, 1, 1, 0),
                    intArrayOf(1, 0, 0, 0, 1)
                )
            ),
            `is`(1)
        )
    }

}
