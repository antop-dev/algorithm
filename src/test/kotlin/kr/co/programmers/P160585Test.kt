package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P160585Test {
    val sut = P160585()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(arrayOf("O.X", ".O.", "..X")), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(arrayOf("OOO", "...", "XXX")), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(arrayOf("...", ".X.", "...")), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(arrayOf("...", "...", "...")), `is`(1))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(arrayOf("O.X", "O.X", "O..")), `is`(1))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(arrayOf("OOX", "OOX", "XXO")), `is`(1))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.solution(arrayOf("XOX", "OXO", "XOO")), `is`(0))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.solution(arrayOf("O.X", "O..", "O..")), `is`(0))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.solution(arrayOf("XO.", "OXO", "XOX")), `is`(1))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.solution(arrayOf("XOX", "OXO", "XOX")), `is`(0))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.solution(arrayOf("OXO", "XOX", "OXO")), `is`(1))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.solution(arrayOf("OOO", "...", "...")), `is`(0))
    }

}
