package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P81302Test {
    val p = P81302()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf(
                    arrayOf("POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"),
                    arrayOf("POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"),
                    arrayOf("PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"),
                    arrayOf("OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"),
                    arrayOf("PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP")
                )
            ), `is`(intArrayOf(1, 0, 1, 1, 1))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf(
                    arrayOf("PXOOO", "OOOOO", "PXOOO", "OOOOO", "OOOPO")
                )
            ), `is`(intArrayOf(0))
        )
    }

}
