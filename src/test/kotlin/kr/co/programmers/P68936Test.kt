package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P68936Test {
    val p = P68936()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf(
                    intArrayOf(1, 1, 0, 0),
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(1, 0, 0, 1),
                    intArrayOf(1, 1, 1, 1)
                )
            ),
            `is`(intArrayOf(4, 9))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf(
                    intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                    intArrayOf(0, 1, 1, 1, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 1, 1, 1, 1),
                    intArrayOf(0, 1, 0, 0, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0, 0, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1),
                    intArrayOf(0, 0, 0, 0, 1, 0, 0, 1),
                    intArrayOf(0, 0, 0, 0, 1, 1, 1, 1)
                )
            ),
            `is`(intArrayOf(10, 15))
        )
    }
}
