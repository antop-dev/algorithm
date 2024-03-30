package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P134239Test {
    val sut = P134239()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                5,
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, -1),
                    intArrayOf(2, -3),
                    intArrayOf(3, -3)
                )
            ),
            `is`(doubleArrayOf(33.0, 31.5, 0.0, -1.0))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                3,
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(1, -2),
                    intArrayOf(3, -3)
                )
            ),
            `is`(doubleArrayOf(47.0, 36.0, 12.0))
        )
    }

}
