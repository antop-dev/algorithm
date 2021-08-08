package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

class P1Test {
    val p = P1()

    @Test
    fun `example 01`() {
        assertThat(
            p.twoSum(intArrayOf(2, 7, 11, 15), 9).toList(),
            Matchers.containsInAnyOrder(0, 1)
        )
    }

    // kotlin
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/
    // https://www.baeldung.com/kotlin-initialize-array
}
