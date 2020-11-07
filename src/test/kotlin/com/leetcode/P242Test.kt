package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P242Test {
    val p = P242()

    @Test
    fun `example 01`() {
        assertThat(p.isAnagram("anagram", "nagaram"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isAnagram("rat", "car"), `is`(false))
    }
}
