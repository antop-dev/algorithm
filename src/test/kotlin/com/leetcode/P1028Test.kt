package com.leetcode

import com.leetcode.P1028.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1028Test {
    private val sut = P1028()

    @Test
    fun `example 01`() {
        val traversal = "1-2--3--4-5--6--7"
        val actual = sut.recoverFromPreorder(traversal).toList()
        val expected = listOf(1, 2, 5, 3, 4, 6, 7)
        assertThat(actual, `is`(expected))
    }

    @Test
    fun `example 02`() {
        val traversal = "1-2--3---4-5--6---7"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 5, 3, null, 6, null, 4, null, 7)))
    }

    @Test
    fun `example 03`() {
        val traversal = "1-401--349---90--88"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 401, null, 349, 88, 90)))
    }

    // 노드가 최소(1개)인 경우
    @Test
    fun `example 04`() {
        val traversal = "1"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1)))
    }

    @Test
    fun `example 05`() {
        val traversal = "1-2"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 06`() {
        val traversal = "1-2--3"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, null, 3)))
    }

    @Test
    fun `example 07`() {
        val traversal = "1-2-3"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 3)))
    }

    @Test
    fun `example 08`() {
        val traversal = "1-2--3--4"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, null, 3, 4)))
    }

    @Test
    fun `example 09`() {
        val traversal = "1-2-3--4"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 3, null, null, 4)))
    }

    // 노드 값이 최대(1,000,000,000)인 경우
    @Test
    fun `example 10`() {
        val traversal = "1-1000000000"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 1000000000)))
    }

    @Test
    fun `example 11`() {
        val traversal = "1-2--3---4----5"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, null, 3, null, 4, null, 5)))
    }

    @Test
    fun `example 12`() {
        val traversal = "1-2--4--5-3--6--7"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun `example 13`() {
        val traversal = "1-2--3---4----5-----6"
        assertThat(
            sut.recoverFromPreorder(traversal).toList(),
            `is`(listOf(1, 2, null, 3, null, 4, null, 5, null, 6))
        )
    }

    @Test
    fun `example 14`() {
        val traversal = "1-2--3-4--5"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 4, 3, null, 5)))
    }

    @Test
    fun `example 15`() {
        val traversal = "1-2-3--4--5"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 3, null, null, 4, 5)))
    }

    @Test
    fun `example 16`() {
        val traversal = "1-5--9---13"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 5, null, 9, null, 13)))
    }

    @Test
    fun `example 17`() {
        val traversal = "10-20--30--40-50"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(10, 20, 50, 30, 40)))
    }

    @Test
    fun `example 18`() {
        val traversal = "1-2--3--4-5"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 5, 3, 4)))
    }

    @Test
    fun `example 19`() {
        val traversal = "1-2--3--4-5--6"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 5, 3, 4, 6)))
    }

    @Test
    fun `example 20`() {
        val traversal = "1-999999999--888888888"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 999999999, null, 888888888)))
    }

    @Test
    fun `example 21`() {
        val traversal = "5-4--3---2----1"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(5, 4, null, 3, null, 2, null, 1)))
    }

    @Test
    fun `example 22`() {
        val traversal = "8-5--9--10-12--3"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(8, 5, 12, 9, 10, 3)))
    }

    @Test
    fun `example 23`() {
        val traversal = "7-3--1--5-11--9--13"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(7, 3, 11, 1, 5, 9, 13)))
    }

    @Test
    fun `example 24`() {
        val traversal = "20-3--2--1-15--17--16"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(20, 3, 15, 2, 1, 17, 16)))
    }

    @Test
    fun `example 25`() {
        val traversal = "100-200--300---400-500--600"
        assertThat(
            sut.recoverFromPreorder(traversal).toList(),
            `is`(listOf(100, 200, 500, 300, null, 600, null, 400))
        )
    }

    @Test
    fun `example 26`() {
        val traversal = "1-10--100---1000----10000"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 10, null, 100, null, 1000, null, 10000)))
    }

    @Test
    fun `example 27`() {
        val traversal = "42"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(42)))
    }

    @Test
    fun `example 28`() {
        val traversal = "1-2--3---4-5"
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(listOf(1, 2, 5, 3, null, null, null, 4)))
    }

    // 노드가 최대(1,000개)이고 왼쪽으로만 이어지는 경우
    @Test
    fun `example 29`() {
        val traversal = (1..1000).joinToString("") { "-".repeat(it - 1) + it }
        val expected = buildList<Int?> {
            add(1)
            for (v in 2..1000) {
                add(v)
                if (v < 1000) add(null)
            }
        }
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(expected))
    }

    // 노드가 최대(1,000개)이고 루트에 자식이 두 개 달린 경우
    @Test
    fun `example 30`() {
        val traversal = "1-2" + (3..1000).joinToString("") { "-".repeat(it - 2) + it }
        val expected = buildList<Int?> {
            addAll(listOf(1, 2, 3, null, null))
            for (v in 4..1000) {
                add(v)
                if (v < 1000) add(null)
            }
        }
        assertThat(sut.recoverFromPreorder(traversal).toList(), `is`(expected))
    }

    private fun TreeNode?.toList(): List<Int?> {
        val result = mutableListOf<Int?>()
        var queue = listOf(this)
        while (queue.isNotEmpty()) {
            val next = mutableListOf<TreeNode?>()
            for (node in queue) {
                if (node == null) {
                    result.add(null)
                } else {
                    result.add(node.`val`)
                    next.add(node.left)
                    next.add(node.right)
                }
            }
            queue = next
        }
        while (result.isNotEmpty() && result.last() == null) {
            result.removeAt(result.size - 1)
        }
        return result
    }
}
