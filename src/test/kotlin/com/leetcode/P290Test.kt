package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P290Test {
    val p = P290()

    @Test
    fun `example 1`() {
        assertThat(p.wordPattern("abba", "dog cat cat dog"), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(p.wordPattern("abba", "dog cat cat fish"), `is`(false))
    }

    @Test
    fun `example 3`() {
        assertThat(p.wordPattern("aaaa", "dog cat cat dog"), `is`(false))
    }

    @Test
    fun `example 4`() {
        assertThat(p.wordPattern("abba", "dog dog dog dog"), `is`(false))
    }

}
