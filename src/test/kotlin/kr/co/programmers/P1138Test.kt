package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.anyOf
import org.junit.jupiter.api.Test

/**
 * 이 문제의 답은 여러가지다.
 */
class P1138Test {
    val p = P1138()

    @Test
    fun `example 01`() {
        assertThat(
            p.alphabetBoardPath("leet"),
            anyOf(`is`("DDR!UURRR!!DDD!"), `is`("RDD!RRRUU!!DDD!"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.alphabetBoardPath("code"),
            anyOf(`is`("RR!DDRR!UUL!R!"), `is`("RR!RRDD!LUU!R!"))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.alphabetBoardPath("zb"),
            anyOf(`is`("DDDDD!UUUUUR!"), `is`("DDDDD!URUUUU!"))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(p.alphabetBoardPath("zz"), `is`("DDDDD!!"))
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.alphabetBoardPath("zdz"),
            anyOf(`is`("DDDDD!UUUUURRR!DDDDLLLD!"), `is`("DDDDD!URRRUUUU!LLLDDDDD!"))
        )
    }

}
