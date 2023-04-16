package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P172927Test {
    val sut = P172927()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                intArrayOf(1, 3, 2),
                arrayOf("diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone")
            ), `is`(12)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                intArrayOf(0, 1, 1),
                arrayOf(
                    "diamond",
                    "diamond",
                    "diamond",
                    "diamond",
                    "diamond",
                    "iron",
                    "iron",
                    "iron",
                    "iron",
                    "iron",
                    "diamond"
                )
            ), `is`(50)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                intArrayOf(0, 0, 0),
                arrayOf("diamond", "diamond")
            ), `is`(0)
        )
    }
}
