package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P138476Test {
    private val sut = P138476()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)), `is`(1))
    }
}
