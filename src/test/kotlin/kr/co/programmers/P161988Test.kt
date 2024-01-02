package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P161988Test {
    val sut = P161988()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(2, 3, -6, 1, 3, -1, 2, 4)), `is`(10L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(intArrayOf(-5)), `is`(5L))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(intArrayOf(6, -7, 16, 3, -4)), `is`(29L))
    }

}
