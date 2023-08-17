package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P181187Test {
    val sut = P181187()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(2, 3), `is`(20L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(2, 4), `is`(40L))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(2, 5), `is`(72L))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.solution(3, 5), `is`(56L))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.solution(10, 20), `is`(952L))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.solution(999999, 1000000), `is`(6281440L))
    }

}
