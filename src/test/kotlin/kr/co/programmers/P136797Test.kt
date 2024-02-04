package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P136797Test {
    val sut = P136797()

    @Test
    fun `example 1`() {
        assertThat(sut.solution("1756"), `is`(10))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution("5123"), `is`(8))
    }

}
