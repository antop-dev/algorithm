package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P242Test {
    val p = P242()

    @Test
    fun `example 01`() {
        assertThat(p.isAnagram("anagram", "nagaram"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isAnagram("rat", "car"), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.isAnagram("ab", "a"), `is`(false))
    }
}
