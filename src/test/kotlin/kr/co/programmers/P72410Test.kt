package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72410Test {
    val p = P72410()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution("...!@BaT#*..y.abcdefghijklm"),
            `is`("bat.y.abcdefghi")
        )
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("z-+.^."), `is`("z--"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("=.="), `is`("aaa"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("123_.def"), `is`("123_.def"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.solution("abcdefghijklmn.p"), `is`("abcdefghijklmn"))
    }

}
