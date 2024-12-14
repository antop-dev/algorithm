package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42747Test {
    val sut = P42747()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(3, 0, 6, 1, 5)), `is`(3))
    }
}
