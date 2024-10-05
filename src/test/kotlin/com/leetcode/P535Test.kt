package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P535Test {
    val sut = P535()

    @Test
    fun `example 1`() {
        val longUrl = "https://www.google.com"
        val url = sut.encode(longUrl)
        val ans = sut.decode(url)
        assertThat(ans, `is`(longUrl))
    }
}
