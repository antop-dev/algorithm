package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P60059Test {
    val sut = P60059()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 1)
                ),
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 0, 1)
                )
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 0)
                ),
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 1)
                )
            ),
            `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                ),
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 1)
                )
            ),
            `is`(true)
        )
    }

}
