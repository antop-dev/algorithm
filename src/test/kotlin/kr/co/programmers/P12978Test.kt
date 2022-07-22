package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12978Test {
    val p = P12978()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                N = 5,
                road = arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(2, 3, 3),
                    intArrayOf(5, 2, 2),
                    intArrayOf(1, 4, 2),
                    intArrayOf(5, 3, 1),
                    intArrayOf(5, 4, 2)
                ),
                k = 3
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                N = 6,
                road = arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(1, 3, 2),
                    intArrayOf(2, 3, 2),
                    intArrayOf(3, 4, 3),
                    intArrayOf(3, 5, 2),
                    intArrayOf(3, 5, 3),
                    intArrayOf(5, 6, 1)
                ),
                k = 4
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                N = 5,
                road = arrayOf(
                    intArrayOf(1, 2, 4),
                    intArrayOf(1, 3, 1),
                    intArrayOf(3, 4, 1),
                    intArrayOf(4, 2, 1),
                    intArrayOf(2, 5, 1)
                ),
                k = 4
            ),
            `is`(5)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.solution(
                N = 2,
                road = arrayOf(
                    intArrayOf(1, 2, 4)
                ),
                k = 4
            ),
            `is`(2)
        )
    }

}
