package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P389479Test {
    val sut = P389479()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(intArrayOf(0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5), 3, 5),
            `is`(7)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(intArrayOf(0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0), 5, 1),
            `is`(11)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(intArrayOf(0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1), 1, 1),
            `is`(12)
        )
    }
}