package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P87377Test {
    val sut = P87377()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, -1, 4),
                    intArrayOf(-2, -1, 4),
                    intArrayOf(0, -1, 1),
                    intArrayOf(5, -8, -12),
                    intArrayOf(5, 8, 12)
                )
            ),
            `is`(
                arrayOf(
                    "....*....",
                    ".........",
                    ".........",
                    "*.......*",
                    ".........",
                    ".........",
                    ".........",
                    ".........",
                    "*.......*"
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(0, 1, -1),
                    intArrayOf(1, 0, -1),
                    intArrayOf(1, 0, 1)
                )
            ),
            `is`(arrayOf("*.*"))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, -1, 0),
                    intArrayOf(2, -1, 0)
                )
            ),
            `is`(arrayOf("*"))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, -1, 0),
                    intArrayOf(2, -1, 0),
                    intArrayOf(4, -1, 0)
                )
            ),
            `is`(arrayOf("*"))
        )
    }
}
