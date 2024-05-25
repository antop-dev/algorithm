package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P258711Test {
    val sut = P258711()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, 3),
                    intArrayOf(4, 3),
                    intArrayOf(1, 1),
                    intArrayOf(2, 1)
                )
            ),
            `is`(intArrayOf(2, 1, 1, 0))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(4, 11),
                    intArrayOf(1, 12),
                    intArrayOf(8, 3),
                    intArrayOf(12, 7),
                    intArrayOf(4, 2),
                    intArrayOf(7, 11),
                    intArrayOf(4, 8),
                    intArrayOf(9, 6),
                    intArrayOf(10, 11),
                    intArrayOf(6, 10),
                    intArrayOf(3, 5),
                    intArrayOf(11, 1),
                    intArrayOf(5, 3),
                    intArrayOf(11, 9),
                    intArrayOf(3, 8)
                )
            ),
            `is`(intArrayOf(4, 0, 1, 2))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(2, 1),
                    intArrayOf(1, 3),
                    intArrayOf(2, 4),
                    intArrayOf(4, 5),
                    intArrayOf(2, 6),
                    intArrayOf(6, 7)
                )
            ),
            `is`(intArrayOf(2, 0, 3, 0))
        )
    }

}
