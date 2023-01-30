package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P132265Test {
    val sut = P132265()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(intArrayOf(1, 2, 3, 1, 4)), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(intArrayOf(10000)), `is`(0))
    }

}
