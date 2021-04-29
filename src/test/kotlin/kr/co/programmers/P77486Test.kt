package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77486Test {
    val p = P77486()

    @Test
    fun `example 01`() {
        assertThat(
            p.solution(
                arrayOf("john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"),
                arrayOf("-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"),
                arrayOf("young", "john", "tod", "emily", "mary"),
                intArrayOf(12, 4, 2, 5, 10)
            ),
            `is`(intArrayOf(360, 958, 108, 0, 450, 18, 180, 1080))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.solution(
                arrayOf("john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"),
                arrayOf("-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"),
                arrayOf("sam", "emily", "jaimie", "edward"),
                intArrayOf(2, 3, 5, 4)
            ),
            `is`(intArrayOf(0, 110, 378, 180, 270, 450, 0, 0))
        )
    }
}
