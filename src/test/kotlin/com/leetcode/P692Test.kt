package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P692Test {
    val p = P692()

    @Test
    fun `example 1`() {
        assertThat(
                p.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2),
                `is`(listOf("i", "love"))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
                p.topKFrequent(arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4),
                `is`(listOf("the", "is", "sunny", "day"))
        )
    }
}