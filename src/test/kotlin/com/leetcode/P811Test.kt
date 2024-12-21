package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P811Test {
    val sut = P811()

    @Test
    fun `example 1`() {
        assertThat(
            sut.subdomainVisits(
                arrayOf(
                    "9001 discuss.leetcode.com"
                )
            ), containsInAnyOrder(
                "9001 leetcode.com",
                "9001 discuss.leetcode.com",
                "9001 com"
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.subdomainVisits(
                arrayOf(
                    "900 google.mail.com",
                    "50 yahoo.com",
                    "1 intel.mail.com",
                    "5 wiki.org"
                )
            ), containsInAnyOrder(
                "901 mail.com",
                "50 yahoo.com",
                "900 google.mail.com",
                "5 wiki.org",
                "5 org",
                "1 intel.mail.com",
                "951 com"
            )
        )
    }
}
