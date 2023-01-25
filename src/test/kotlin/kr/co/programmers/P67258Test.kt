package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P67258Test {
    val sut = P67258()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(arrayOf("DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA")),
            `is`(intArrayOf(3, 7))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(arrayOf("AA", "AB", "AC", "AA", "AC")), `is`(intArrayOf(1, 3))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(arrayOf("XYZ", "XYZ", "XYZ")), `is`(intArrayOf(1, 1))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(arrayOf("ZZZ", "YYY", "NNNN", "YYY", "BBB")), `is`(intArrayOf(1, 5))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(arrayOf("AA", "AB", "AB", "AB", "AA", "AC", "AB", "AA", "AB", "AC")),
            `is`(intArrayOf(4, 6))
        )
    }

}
