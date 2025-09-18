package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P76503Test {
    val sut = P76503()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                a = intArrayOf(-5, 0, 2, 1, 2),
                edges = arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(3, 4),
                    intArrayOf(2, 3),
                    intArrayOf(0, 3),
                )
            ),
            `is`(9)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                a = intArrayOf(0, 1, 0),
                edges = arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 2),
                )
            ),
            `is`(-1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                a = intArrayOf(-2, 8, -5, -5, -3, 0, 5, 2),
                edges = arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                    intArrayOf(1, 5),
                    intArrayOf(2, 6),
                    intArrayOf(2, 7),
                )
            ),
            `is`(17)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                a = intArrayOf(-10, 10),
                edges = arrayOf(
                    intArrayOf(0, 1),
                )
            ),
            `is`(10)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(
                a = intArrayOf(0, 10),
                edges = arrayOf(
                    intArrayOf(0, 1),
                )
            ),
            `is`(-1)
        )
    }
}