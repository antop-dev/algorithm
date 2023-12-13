package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P181188Test {
    val sut = P181188()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(4, 5),
                    intArrayOf(4, 8),
                    intArrayOf(10, 14),
                    intArrayOf(11, 13),
                    intArrayOf(5, 12),
                    intArrayOf(3, 7),
                    intArrayOf(1, 4)
                )
            ), `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 10), intArrayOf(1, 10), intArrayOf(1, 10), intArrayOf(1, 10), intArrayOf(1, 10)
                )
            ), `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 3), intArrayOf(3, 5), intArrayOf(5, 7), intArrayOf(7, 9), intArrayOf(9, 11)
                )
            ), `is`(5)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                arrayOf(
                    intArrayOf(1, 3), intArrayOf(4, 6), intArrayOf(7, 9), intArrayOf(10, 12), intArrayOf(13, 15)
                )
            ), `is`(5)
        )
    }

}
