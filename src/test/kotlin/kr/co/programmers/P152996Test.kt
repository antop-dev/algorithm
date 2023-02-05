package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P152996Test {
    val sut = P152996()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(100, 180, 360, 100, 270)), `is`(4L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(intArrayOf(100, 100, 100)), `is`(3L))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(intArrayOf(100, 100, 100, 200)), `is`(6L))
    }

}
