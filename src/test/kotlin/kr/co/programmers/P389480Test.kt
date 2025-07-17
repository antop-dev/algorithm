package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P389480Test {
    val sut = P389480()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(2, 1),
                ), 4, 4
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(2, 1),
                ), 1, 7
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                ), 7, 1
            ),
            `is`(6)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                ), 6, 1
            ),
            `is`(-1)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(1, 3),
                    intArrayOf(1, 3),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(2, 3),
                    intArrayOf(2, 3),
                ), 6, 7
            ),
            `is`(5)
        )
    }

}