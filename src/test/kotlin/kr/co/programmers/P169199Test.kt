package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P169199Test {
    val sut = P169199()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "...D..R",
                    ".D.G...",
                    "....D.D",
                    "D....D.",
                    "..D...."
                )
            ),
            `is`(7)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    ".D.R",
                    "....",
                    ".G..",
                    "...D"
                )
            ),
            `is`(-1)
        )
    }
}
