package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/two-sum/
 */
internal class P1Test {
    val p = P1()

    @Test
    internal fun `example 01`() {
        assertArrayEquals(intArrayOf(0, 1), p.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    // kotlin
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/
    // https://www.baeldung.com/kotlin-initialize-array
}