package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P83201Test {
    val p = P83201()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                scores = arrayOf(
                    intArrayOf(100, 90, 98, 88, 65),
                    intArrayOf(50, 45, 99, 85, 77),
                    intArrayOf(47, 88, 95, 80, 67),
                    intArrayOf(61, 57, 100, 80, 65),
                    intArrayOf(24, 90, 94, 75, 65)
                )
            ),
            `is`("FBABD")
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                scores = arrayOf(
                    intArrayOf(50, 90),
                    intArrayOf(50, 87)
                )
            ),
            `is`("DA")
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                scores = arrayOf(
                    intArrayOf(70, 49, 90),
                    intArrayOf(68, 50, 38),
                    intArrayOf(73, 31, 100)
                )
            ),
            `is`("CFD")
        )
    }

}
