package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P146Test {

    @Test
    fun `example 1`() {
        val obj = P146(2)
        obj.put(1, 1)
        obj.put(2, 2)
        assertThat(obj.get(1), `is`(1))
        obj.put(3, 3)
        assertThat(obj.get(2), `is`(-1))
        obj.put(4, 4)
        assertThat(obj.get(1), `is`(-1))
        assertThat(obj.get(3), `is`(3))
        assertThat(obj.get(4), `is`(4))
    }
}
