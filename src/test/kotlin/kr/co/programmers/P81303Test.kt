package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P81303Test {
    val sut = P81303()

    @Test
    fun `example 01`() {
        assertThat(
            sut.solution(8, 2, arrayOf("D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z")),
            `is`("OOOOXOOO")
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.solution(8, 2, arrayOf("D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C")),
            `is`("OOXOXOOO")
        )
    }
}