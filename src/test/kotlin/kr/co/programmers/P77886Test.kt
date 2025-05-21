package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77886Test {
    val sut = P77886()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(arrayOf("1110", "100111100", "0111111010")),
            `is`(arrayOf("1101", "100110110", "0110110111"))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(arrayOf("110")),
            `is`(arrayOf("110"))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution(arrayOf("1011110", "01110", "101101111010")),
            `is`(arrayOf("1011011", "01101", "101101101101"))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution(arrayOf("0", "1")),
            `is`(arrayOf("0", "1"))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution(arrayOf("0000", "1111")),
            `is`(arrayOf("0000", "1111"))
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.solution(arrayOf("1100111011101001")),
            `is`(arrayOf("0101101101101101"))
        )
    }
}