package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P159993Test {
    val sut = P159993()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "SOOOL",
                    "XXXXO",
                    "OOOOO",
                    "OXXXX",
                    "OOOOE"
                )
            ), `is`(16)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "LOOXS",
                    "OOOOX",
                    "OOOOO",
                    "OOOOO",
                    "EOOOO"
                )
            ), `is`(-1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "SOOOOOO",
                    "OXXXXXO",
                    "OXXXXXL",
                    "OXXXXXX",
                    "OOOXOOO",
                    "OXOXOXO",
                    "OXOOOXO"
                )
            ), `is`(-1)
        )
    }
}
