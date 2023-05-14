package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P155651Test {
    val sut = P155651()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                arrayOf(
                    arrayOf("15:00", "17:00"),
                    arrayOf("16:40", "18:20"),
                    arrayOf("14:20", "15:20"),
                    arrayOf("14:10", "19:20"),
                    arrayOf("18:20", "21:20")
                )
            ), `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                arrayOf(
                    arrayOf("09:10", "10:10"),
                    arrayOf("10:20", "12:20")
                )
            ), `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(
                arrayOf(
                    arrayOf("10:20", "12:30"),
                    arrayOf("10:20", "12:30"),
                    arrayOf("10:20", "12:30")
                )
            ), `is`(3)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(
                arrayOf(
                    arrayOf("10:20", "11:59"),
                    arrayOf("11:05", "12:30")
                )
            ), `is`(2)
        )
    }
}
