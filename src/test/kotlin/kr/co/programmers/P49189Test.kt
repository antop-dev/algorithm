package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P49189Test {
    val p = P49189()

    @Test
    fun `example 01`() {
        assertThat(
                p.solution(6, arrayOf(
                        intArrayOf(3, 6),
                        intArrayOf(4, 3),
                        intArrayOf(3, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 2),
                        intArrayOf(2, 4),
                        intArrayOf(5, 2))
                ),
                `is`(3)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
                p.solution(4, arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4))
                ),
                `is`(1)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
                p.solution(5, arrayOf(
                        intArrayOf(4, 3),
                        intArrayOf(3, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 2),
                        intArrayOf(2, 4),
                        intArrayOf(5, 2))
                ),
                `is`(2)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
                p.solution(4, arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(2, 3),
                        intArrayOf(2, 4),
                        intArrayOf(3, 4))
                ),
                `is`(1)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
                p.solution(4, arrayOf(
                        intArrayOf(4, 3),
                        intArrayOf(1, 3),
                        intArrayOf(2, 3))
                ),
                `is`(2)
        )
    }

}
