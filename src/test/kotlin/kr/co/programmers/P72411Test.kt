package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72411Test {
    val p = P72411()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf("ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"),
                intArrayOf(2, 3, 4)
            ),
            `is`(arrayOf("AC", "ACDE", "BCFG", "CDE"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf("ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"),
                intArrayOf(2, 3, 5)
            ),
            `is`(arrayOf("ACD", "AD", "ADE", "CD", "XYZ"))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.solution(
                arrayOf("XYZ", "XWY", "WXA"),
                intArrayOf(2, 3, 4)
            ),
            `is`(arrayOf("WX", "XY"))
        )
    }

}
