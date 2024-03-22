package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P92344Test {
    val sut = P92344()

    @Test
    fun `example 1`() {
        val board = arrayOf(
            intArrayOf(5, 5, 5, 5, 5),
            intArrayOf(5, 5, 5, 5, 5),
            intArrayOf(5, 5, 5, 5, 5),
            intArrayOf(5, 5, 5, 5, 5)
        )
        val skill = arrayOf(
            intArrayOf(1, 0, 0, 3, 4, 4),
            intArrayOf(1, 2, 0, 2, 3, 2),
            intArrayOf(2, 1, 0, 3, 1, 2),
            intArrayOf(1, 0, 1, 3, 3, 1)
        )
        assertThat(sut.solution(board, skill), `is`(10))
    }

    @Test
    fun `example 2`() {
        val board = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val skill = arrayOf(
            intArrayOf(1, 1, 1, 2, 2, 4),
            intArrayOf(1, 0, 0, 1, 1, 2),
            intArrayOf(2, 2, 0, 2, 0, 100)
        )
        assertThat(sut.solution(board, skill), `is`(6))
    }

    @Test
    fun `example 3`() {
        val board = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1)
        )
        val skill = arrayOf(
            intArrayOf(1, 0, 0, 0, 0, 1)
        )
        assertThat(sut.solution(board, skill), `is`(8))
    }

}
