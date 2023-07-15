package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P147354Test {
    val sut = P147354()

    @Test
    fun `example 1`() {
        val answer = sut.solution(
            arrayOf(
                intArrayOf(2, 2, 6),
                intArrayOf(1, 5, 10),
                intArrayOf(4, 2, 9),
                intArrayOf(3, 8, 3)
            ), 2, 2, 3
        )

        assertThat(answer, `is`(4))
    }
}
