package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P848Test {
    val p = P848()

    @Test
    fun `example 01`() {
        assertThat(p.shiftingLetters("abc", intArrayOf(3, 5, 9)), `is`("rpl"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.shiftingLetters("aaa", intArrayOf(1, 1, 1)), `is`("dcb"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.shiftingLetters("z", intArrayOf(3)), `is`("c"))
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.shiftingLetters(
                "mkgfzkkuxownxvfvxasy",
                intArrayOf(
                    505870226,
                    437526072,
                    266740649,
                    224336793,
                    532917782,
                    311122363,
                    567754492,
                    595798950,
                    81520022,
                    684110326,
                    137742843,
                    275267355,
                    856903962,
                    148291585,
                    919054234,
                    467541837,
                    622939912,
                    116899933,
                    983296461,
                    536563513
                )
            ), `is`("wqqwlcjnkphhsyvrkdod")
        )
    }

}
