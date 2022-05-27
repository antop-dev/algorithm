package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P92341Test {
    val p = P92341()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                intArrayOf(180, 5000, 10, 600),
                arrayOf(
                    "05:34 5961 IN",
                    "06:00 0000 IN",
                    "06:34 0000 OUT",
                    "07:59 5961 OUT",
                    "07:59 0148 IN",
                    "18:59 0000 IN",
                    "19:09 0148 OUT",
                    "22:59 5961 IN",
                    "23:00 5961 OUT"
                )
            ), `is`(intArrayOf(14600, 34400, 5000))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                intArrayOf(120, 0, 60, 591),
                arrayOf(
                    "16:00 3961 IN",
                    "16:00 0202 IN",
                    "18:00 3961 OUT",
                    "18:00 0202 OUT",
                    "23:58 3961 IN"
                )
            ), `is`(intArrayOf(0, 591))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                intArrayOf(1, 461, 1, 10),
                arrayOf("00:00 1234 IN")
            ), `is`(intArrayOf(14841))
        )
    }

}
