package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P142085Test {
    val sut = P142085()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(7, 3, intArrayOf(4, 2, 4, 5, 3, 3, 1)), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(2, 4, intArrayOf(3, 3, 3, 3)), `is`(4))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(5, 2, intArrayOf(99, 1, 99)), `is`(3))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(7, 1, intArrayOf(2, 1, 5, 1)), `is`(4))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(7, 2, intArrayOf(2, 1, 99, 99)), `is`(4))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(7, 3, intArrayOf(5, 5, 5, 5, 2, 3, 1)), `is`(5))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.solution(1, 6, intArrayOf(2, 2, 2, 2, 3, 3, 1)), `is`(7))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.solution(10, 1, intArrayOf(2, 2, 2, 2, 2, 10)), `is`(6))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.solution(10, 1, intArrayOf(2, 2, 2, 2, 10)), `is`(5))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.solution(7, 3, intArrayOf(5, 2, 4, 1, 2, 3)), `is`(6))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.solution(3, 1, intArrayOf(3, 4)), `is`(2))
    }

}
