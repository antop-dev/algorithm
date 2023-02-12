package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P154540Test {
    val sut = P154540()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(arrayOf("X591X", "X1X5X", "X231X", "1XXX1")),
            `is`(intArrayOf(1, 1, 27))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(arrayOf("XXX", "XXX", "XXX")),
            `is`(intArrayOf(-1))
        )
    }

}
