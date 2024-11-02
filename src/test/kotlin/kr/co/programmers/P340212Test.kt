package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P340212Test {
    val sut = P340212()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                diffs = intArrayOf(1, 5, 3),
                times = intArrayOf(2, 4, 7),
                limit = 30L
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                diffs = intArrayOf(1, 4, 4, 2),
                times = intArrayOf(6, 3, 8, 2),
                limit = 59L
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                diffs = intArrayOf(1, 328, 467, 209, 54),
                times = intArrayOf(2, 7, 1, 4, 3),
                limit = 1723L
            ),
            `is`(294)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                diffs = intArrayOf(1, 99999, 100000, 99995),
                times = intArrayOf(9999, 9001, 9999, 9001),
                limit = 3456789012L
            ),
            `is`(39354)
        )
    }
}
