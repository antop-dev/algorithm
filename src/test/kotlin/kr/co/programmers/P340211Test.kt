package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P340211Test {
    val sut = P340211()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                points = arrayOf(
                    intArrayOf(3, 2),
                    intArrayOf(6, 4),
                    intArrayOf(4, 7),
                    intArrayOf(1, 4),
                ),
                routes = arrayOf(
                    intArrayOf(4, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 4),
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                points = arrayOf(
                    intArrayOf(3, 2),
                    intArrayOf(6, 4),
                    intArrayOf(4, 7),
                    intArrayOf(1, 4),
                ),
                routes = arrayOf(
                    intArrayOf(4, 2),
                    intArrayOf(1, 3),
                    intArrayOf(4, 2),
                    intArrayOf(4, 3),
                )
            ),
            `is`(9)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                points = arrayOf(
                    intArrayOf(2, 2),
                    intArrayOf(2, 3),
                    intArrayOf(2, 7),
                    intArrayOf(6, 6),
                    intArrayOf(5, 2),
                ),
                routes = arrayOf(
                    intArrayOf(2, 3, 4, 5),
                    intArrayOf(1, 3, 4, 5),
                )
            ),
            `is`(0)
        )
    }
}