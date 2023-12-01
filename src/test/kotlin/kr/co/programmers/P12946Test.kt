package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12946Test {
    val sut = P12946()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(2), `is`(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 3)
                )
            )
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(3), `is`(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3)
                )
            )
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(4), `is`(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 3),
                    intArrayOf(2, 1),
                    intArrayOf(3, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 3)
                )
            )
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(5), `is`(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(3, 1),
                    intArrayOf(2, 1),
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(2, 1),
                    intArrayOf(3, 2),
                    intArrayOf(3, 1),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3)
                )
            )
        )
    }

}
