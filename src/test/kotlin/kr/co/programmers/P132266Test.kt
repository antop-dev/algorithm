package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P132266Test {
    val sut = P132266()

    @Test
    fun `example 1`() {
        val ans = sut.solution(
            n = 3,
            roads = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
            ),
            sources = intArrayOf(2, 3),
            destination = 1
        )
        assertThat(ans, `is`(intArrayOf(1, 2)))
    }

    @Test
    fun `example 2`() {
        val ans = sut.solution(
            n = 5,
            roads = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 4),
                intArrayOf(2, 4),
                intArrayOf(2, 5),
                intArrayOf(4, 5),
            ),
            sources = intArrayOf(1, 3, 5),
            destination = 5
        )
        assertThat(ans, `is`(intArrayOf(2, -1, 0)))
    }

}
