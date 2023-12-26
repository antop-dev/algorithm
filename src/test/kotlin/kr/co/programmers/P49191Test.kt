package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P49191Test {
    val sut = P49191()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                5, arrayOf(
                    intArrayOf(4, 3),
                    intArrayOf(4, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 2),
                    intArrayOf(2, 5)
                )
            ),
            `is`(2)
        )
    }
}
