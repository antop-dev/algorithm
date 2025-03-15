package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P388352Test {
    val sut = P388352()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                n = 10,
                q = arrayOf(
                    intArrayOf(1, 2, 3, 4, 5),
                    intArrayOf(6, 7, 8, 9, 10),
                    intArrayOf(3, 7, 8, 9, 10),
                    intArrayOf(2, 5, 7, 9, 10),
                    intArrayOf(3, 4, 5, 6, 7),
                ),
                ans = intArrayOf(2, 3, 4, 3, 3)
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                n = 15,
                q = arrayOf(
                    intArrayOf(2, 3, 9, 12, 13),
                    intArrayOf(1, 4, 6, 7, 9),
                    intArrayOf(1, 2, 8, 10, 12),
                    intArrayOf(6, 7, 11, 13, 15),
                    intArrayOf(1, 4, 10, 11, 14),
                ),
                ans = intArrayOf(2, 1, 3, 0, 1)
            ),
            `is`(5)
        )
    }
}
