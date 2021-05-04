package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P76502Test {
    val p = P76502()

    @Test
    fun `example 01`() {
        assertThat(p.solution("[](){}"), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("}]()[{"), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("[)(]"), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("}}}"), `is`(0))
    }

}
