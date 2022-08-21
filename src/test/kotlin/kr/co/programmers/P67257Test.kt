package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P67257Test {
    private val sut = P67257()

    @Test
    fun `example 01`() {
        assertThat(sut.solution("100-200*300-500+20"), `is`(60420L))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.solution("50*6-3*2"), `is`(300L))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.solution("2*2*2*2*2-2*2*2"), `is`(24L))
    }

    @Test
    fun `example 05`() {
        assertThat(
            sut.solution("177-661*999*99-133+221+334+555-166-144-551-166*166-166*166-133*88*55-11*4+55*888*454*12+11-66+444*99"),
            `is`(6083974714)
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            sut.solution("200-300-500-600*40+500+500"),
            `is`(1248000L)
        )
    }


}
