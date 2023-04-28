package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P178870Test {
    val sut = P178870()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(intArrayOf(1, 2, 3, 4, 5), 7), `is`(intArrayOf(2, 3)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(intArrayOf(1, 1, 1, 2, 3, 4, 5), 5), `is`(intArrayOf(6, 6)))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(intArrayOf(2, 2, 2, 2, 2), 6), `is`(intArrayOf(0, 2)))
    }

}
