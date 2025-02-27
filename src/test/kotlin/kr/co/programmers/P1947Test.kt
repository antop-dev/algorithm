package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1947Test {
    val sut = P1947()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maxCompatibilitySum(
                students = arrayOf(
                    intArrayOf(1, 1, 0), // 1
                    intArrayOf(1, 0, 1), // 2
                    intArrayOf(0, 0, 1), // 3
                ),
                mentors = arrayOf(
                    intArrayOf(1, 0, 0), // A
                    intArrayOf(0, 0, 1), // B
                    intArrayOf(1, 1, 0), // C
                )
            ), `is`(8)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.maxCompatibilitySum(
                students = arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 0),
                    intArrayOf(0, 0),
                ),
                mentors = arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                )
            ), `is`(0)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maxCompatibilitySum(
                students = arrayOf(
                    intArrayOf(0, 1, 0, 1, 1, 1),
                    intArrayOf(1, 0, 0, 1, 0, 1),
                    intArrayOf(1, 0, 1, 1, 0, 0),
                ),
                mentors = arrayOf(
                    intArrayOf(1, 0, 0, 0, 0, 1),
                    intArrayOf(0, 1, 0, 0, 1, 1),
                    intArrayOf(0, 1, 0, 0, 1, 1),
                )
            ), `is`(10)
        )
    }
}
