package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P64064Test {
    val p = P64064()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf("frodo", "fradi", "crodo", "abc123", "frodoc"),
                arrayOf("fr*d*", "abc1**")
            ), `is`(2)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf("frodo", "fradi", "crodo", "abc123", "frodoc"),
                arrayOf("*rodo", "*rodo", "******")
            ), `is`(2)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                arrayOf("frodo", "fradi", "crodo", "abc123", "frodoc"),
                arrayOf("fr*d*", "*rodo", "******", "******")
            ), `is`(3)
        )
    }

}
