package com.leetcode

import com.leetcode.P690.Employee
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P690Test {
    val p = P690()

    @Test
    fun `example 01`() {
        val employees = listOf(Employee().apply {
            id = 1
            importance = 5
            subordinates = listOf(2, 3)
        }, Employee().apply {
            id = 2
            importance = 3
        }, Employee().apply {
            id = 3
            importance = 3
        })

        assertThat(p.getImportance(employees, 1), `is`(11))
    }
}
