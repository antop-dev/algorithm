package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P161989Test {
    private val sut = P161989()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(8, 4, intArrayOf(2, 3, 6)), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(5, 4, intArrayOf(1, 3)), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(4, 1, intArrayOf(1, 2, 3, 4)), `is`(4))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(1, 1, intArrayOf(1)), `is`(1))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(100, 3, intArrayOf(1, 95, 96, 97, 98, 99, 100)), `is`(3))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(10, 9, intArrayOf(1, 3, 5, 7, 9)), `is`(1))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.solution(10, 9, intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), `is`(2))
    }

}
