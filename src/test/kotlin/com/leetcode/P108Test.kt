package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull


// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
internal class P108Test {
    val p = P108()

    @Test
    fun `example 1`() {
        val root = p.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))

        assertNotNull(root)
        assertEquals(0, root.`val`)

        assertEquals(-10, root.left?.`val`)
        assertEquals(-3, root.left?.right?.`val`)

        assertEquals(5, root.right?.`val`)
        assertEquals(9, root.right?.right?.`val`)
    }

    @Test
    fun `example 2`() {
        val root = p.sortedArrayToBST(intArrayOf(0, 1, 2, 3, 4, 5))

        assertNotNull(root)
        assertEquals(2, root.`val`)

        assertEquals(0, root.left?.`val`)
        assertEquals(1, root.left?.right?.`val`)

        assertEquals(4, root.right?.`val`)
        assertEquals(3, root.right?.left?.`val`)
        assertEquals(5, root.right?.right?.`val`)
    }
}