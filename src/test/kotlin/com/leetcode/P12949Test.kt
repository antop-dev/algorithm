package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12949Test {
    val p = P12949()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(3, 2),
                    intArrayOf(4, 1)
                ),
                arrayOf(
                    intArrayOf(3, 3),
                    intArrayOf(3, 3)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(15, 15),
                    intArrayOf(15, 15),
                    intArrayOf(15, 15)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf(
                    intArrayOf(2, 3, 2),
                    intArrayOf(4, 2, 4),
                    intArrayOf(3, 1, 4)
                ),
                arrayOf(
                    intArrayOf(5, 4, 3),
                    intArrayOf(2, 4, 1),
                    intArrayOf(3, 1, 1)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(22, 22, 11),
                    intArrayOf(36, 28, 18),
                    intArrayOf(29, 20, 14)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                arrayOf(
                    intArrayOf(2, 3, 3),
                    intArrayOf(4, 2, 4),
                    intArrayOf(3, 1, 4)
                ),
                arrayOf(
                    intArrayOf(5, 4),
                    intArrayOf(2, 4),
                    intArrayOf(3, 1)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(25, 23),
                    intArrayOf(36, 28),
                    intArrayOf(29, 20)
                )
            )
        )
    }

}
