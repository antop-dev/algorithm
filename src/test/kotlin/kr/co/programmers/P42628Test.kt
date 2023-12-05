package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42628Test {
    val sut = P42628()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "I 16",
                    "I -5643",
                    "D -1",
                    "D 1",
                    "D 1",
                    "I 123",
                    "D -1"
                )
            ), `is`(intArrayOf(0, 0))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    "I -45",
                    "I 653",
                    "D 1",
                    "I -642",
                    "I 45",
                    "I 97",
                    "D 1",
                    "D -1",
                    "I 333"
                )
            ), `is`(intArrayOf(333, -45))
        )
    }

}
