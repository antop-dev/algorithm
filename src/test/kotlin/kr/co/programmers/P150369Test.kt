package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P150369Test {
    private val sut = P150369()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(4, 5, intArrayOf(1, 0, 3, 1, 2), intArrayOf(0, 3, 0, 4, 0)),
            `is`(16L)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(2, 7, intArrayOf(1, 0, 2, 0, 1, 0, 2), intArrayOf(0, 2, 0, 1, 0, 2, 0)), `is`(30L))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(2, 2, intArrayOf(0, 6), intArrayOf(0, 0)), `is`(12L))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(2, 2, intArrayOf(0, 0), intArrayOf(0, 4)), `is`(8L))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(2, 2, intArrayOf(0, 0), intArrayOf(0, 0)), `is`(0L))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(2, 2, intArrayOf(1, 0), intArrayOf(1, 0)), `is`(2L))
    }

}
