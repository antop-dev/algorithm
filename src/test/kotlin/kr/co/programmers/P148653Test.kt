package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P148653Test {
    val sut = P148653()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(16), `is`(6))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(2554), `is`(16))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(1), `is`(1))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(646), `is`(13))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(5), `is`(5))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(155), `is`(11))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.solution(154), `is`(10))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.solution(75), `is`(8))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.solution(555), `is`(14))
    }
}
