package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2336Test {

    @Test
    fun `example 1`() {
        val obj = P2336()
        obj.addBack(2)
        assertThat(obj.popSmallest(), `is`(1))
        assertThat(obj.popSmallest(), `is`(2))
        assertThat(obj.popSmallest(), `is`(3))
        obj.addBack(1)
        assertThat(obj.popSmallest(), `is`(1))
        assertThat(obj.popSmallest(), `is`(4))
        assertThat(obj.popSmallest(), `is`(5))
    }

    @Test
    fun `example 2`() {
        val obj = P2336()
        assertThat(obj.popSmallest(), `is`(1))
        assertThat(obj.popSmallest(), `is`(2))
        obj.addBack(3)
        assertThat(obj.popSmallest(), `is`(3))
        obj.addBack(2)
        assertThat(obj.popSmallest(), `is`(2))
        assertThat(obj.popSmallest(), `is`(4))
    }
}
