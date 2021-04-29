package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77485Test {
    val p = P77485()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                6, 6, arrayOf(
                    intArrayOf(2, 2, 5, 4),
                    intArrayOf(3, 3, 6, 6),
                    intArrayOf(5, 1, 6, 3)
                )
            ),
            `is`(intArrayOf(8, 10, 25))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                3, 3, arrayOf(
                    intArrayOf(1, 1, 2, 2),
                    intArrayOf(1, 2, 2, 3),
                    intArrayOf(2, 1, 3, 2),
                    intArrayOf(2, 2, 3, 3)

                )
            ),
            `is`(intArrayOf(1, 1, 5, 3))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                100, 97, arrayOf(
                    intArrayOf(1, 1, 100, 97)
                )
            ),
            `is`(intArrayOf(1))
        )
    }

}
