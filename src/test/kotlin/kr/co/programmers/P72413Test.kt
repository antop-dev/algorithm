package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72413Test {
    val sut = P72413()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                6, 4, 6, 2,
                arrayOf(
                    intArrayOf(4, 1, 10),
                    intArrayOf(3, 5, 24),
                    intArrayOf(5, 6, 2),
                    intArrayOf(3, 1, 41),
                    intArrayOf(5, 1, 24),
                    intArrayOf(4, 6, 50),
                    intArrayOf(2, 4, 66),
                    intArrayOf(2, 3, 22),
                    intArrayOf(1, 6, 25)
                )
            ),
            `is`(82)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                7, 3, 4, 1,
                arrayOf(
                    intArrayOf(5, 7, 9),
                    intArrayOf(4, 6, 4),
                    intArrayOf(3, 6, 1),
                    intArrayOf(3, 2, 3),
                    intArrayOf(2, 1, 6)
                )
            ),
            `is`(14)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                6, 4, 5, 6,
                arrayOf(
                    intArrayOf(2, 6, 6),
                    intArrayOf(6, 3, 7),
                    intArrayOf(4, 6, 7),
                    intArrayOf(6, 5, 11),
                    intArrayOf(2, 5, 12),
                    intArrayOf(5, 3, 20),
                    intArrayOf(2, 4, 8),
                    intArrayOf(4, 3, 9)
                )
            ),
            `is`(18)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                6, 1, 3, 4,
                arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(1, 3, 10),
                    intArrayOf(1, 4, 10),
                    intArrayOf(2, 3, 1),
                    intArrayOf(2, 4, 1)
                )
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 5`() {
        val cost = 100_000
        val oneTo198 = (1..198)
            .zipWithNext { a, b -> intArrayOf(a, b, cost) }
            .toTypedArray()
        val oneTo200 = oneTo198 +
                intArrayOf(198, 199, cost) +
                intArrayOf(198, 200, cost)

        assertThat(
            sut.solution(
                200, 1, 200, 199,
                oneTo200
            ),
            `is`(((198 - 1) * cost) + (2 * cost))
        )
    }

    @Test
    fun `example 6`() {
        val cost = 100_000
        assertThat(
            sut.solution(
                200, 1, 2, 3,
                arrayOf(
                    intArrayOf(1, 2, cost),
                    intArrayOf(2, 3, cost),
                    intArrayOf(3, 4, cost),
                    intArrayOf(198, 199, cost),
                    intArrayOf(199, 200, cost),
                    intArrayOf(197, 199, cost)
                )
            ),
            `is`(200000)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.solution(
                3, 1, 2, 3,
                arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(1, 3, 2),
                    intArrayOf(2, 3, 3)
                )
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 8`() {
        val cost = 100_000
        val oneTo200 = (1..200)
            .zipWithNext { a, b -> intArrayOf(a, b, cost) }
            .toTypedArray()

        assertThat(
            sut.solution(
                200, 2, 100, 200,
                oneTo200
            ),
            `is`(198 * cost)
        )
    }

}
