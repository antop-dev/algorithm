package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42892Test {
    val sut = P42892()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(5, 3),
                    intArrayOf(11, 5),
                    intArrayOf(13, 3),
                    intArrayOf(3, 5),
                    intArrayOf(6, 1),
                    intArrayOf(1, 3),
                    intArrayOf(8, 6),
                    intArrayOf(7, 2),
                    intArrayOf(2, 2),
                )
            ), `is`(
                arrayOf(
                    intArrayOf(7, 4, 6, 9, 1, 8, 5, 2, 3),
                    intArrayOf(9, 6, 5, 8, 1, 4, 3, 2, 7),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(0, 0),
                )
            ), `is`(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(1),
                )
            )
        )
    }
}