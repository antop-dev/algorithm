package com.leetcode

import com.leetcode.P958.TreeNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P958Test {
    private val sut = P958()

    // LeetCode 레벨 순회 표현([1,2,null,3])으로 트리 생성
    private fun treeOf(values: List<Int?>): TreeNode? {
        if (values.isEmpty() || values[0] == null) return null
        val root = TreeNode(values[0]!!)
        val queue = ArrayDeque(listOf(root))
        var i = 1
        while (queue.isNotEmpty() && i < values.size) {
            val node = queue.removeFirst()
            values[i++]?.let { node.left = TreeNode(it).also(queue::add) }
            if (i < values.size) {
                values[i++]?.let { node.right = TreeNode(it).also(queue::add) }
            }
        }
        return root
    }

    // 문제 예제 1
    @Test
    fun `example 01`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 문제 예제 2
    @Test
    fun `example 02`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, null, 7))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 노드가 최소(1개)인 경우
    @Test
    fun `example 03`() {
        val root = treeOf(listOf(1))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 왼쪽 자식만 있는 경우
    @Test
    fun `example 04`() {
        val root = treeOf(listOf(1, 2))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 오른쪽 자식만 있는 경우
    @Test
    fun `example 05`() {
        val root = treeOf(listOf(1, null, 2))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 포화 이진 트리 (높이 2)
    @Test
    fun `example 06`() {
        val root = treeOf(listOf(1, 2, 3))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 포화 이진 트리 (높이 3)
    @Test
    fun `example 07`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 마지막 레벨 왼쪽 하나만
    @Test
    fun `example 08`() {
        val root = treeOf(listOf(1, 2, 3, 4))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 마지막 레벨 왼쪽에서 두 번째만 비어있음
    @Test
    fun `example 09`() {
        val root = treeOf(listOf(1, 2, 3, null, 5))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 마지막 레벨 가운데가 비어있음
    @Test
    fun `example 10`() {
        val root = treeOf(listOf(1, 2, 3, 4, null, 6))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 마지막 레벨 왼쪽 두 개
    @Test
    fun `example 11`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 왼쪽으로만 치우친 사슬
    @Test
    fun `example 12`() {
        val root = treeOf(listOf(1, 2, null, 3))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 오른쪽 서브트리만 깊음
    @Test
    fun `example 13`() {
        val root = treeOf(listOf(1, 2, 3, null, null, 4, 5))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 마지막 레벨 끝만 있음
    @Test
    fun `example 14`() {
        val root = treeOf(listOf(1, 2, 3, null, null, null, 7))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 높이 4 마지막 레벨 일부 채움
    @Test
    fun `example 15`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 높이 4 마지막 레벨 중간 공백
    @Test
    fun `example 16`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7, 8, null, 10))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 높이 4 오른쪽 아래에만 노드
    @Test
    fun `example 17`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, 15))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 높이 4 마지막 레벨 가득 참
    @Test
    fun `example 18`() {
        val root = treeOf((1..15).toList())
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 높이 3 마지막 레벨 6개
    @Test
    fun `example 19`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 레벨 3 이 비어있는데 레벨 4 존재
    @Test
    fun `example 20`() {
        val root = treeOf(listOf(1, 2, 3, 4, null, 6, 7, 8))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 같은 값으로 구성된 완전 이진 트리
    @Test
    fun `example 21`() {
        val root = treeOf(listOf(1000, 1000, 1000, 1000, 1000, 1000))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 최대 값 노드 하나
    @Test
    fun `example 22`() {
        val root = treeOf(listOf(1000))
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 왼쪽 자식 없이 오른쪽 자식 둘째 레벨
    @Test
    fun `example 23`() {
        val root = treeOf(listOf(1, 2, 3, null, 4))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 왼쪽 리프의 오른쪽 자식만 존재
    @Test
    fun `example 24`() {
        val root = treeOf(listOf(1, 2, 3, 4, 5, 6, 7, null, 8))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 노드 99개 완전 이진 트리
    @Test
    fun `example 25`() {
        val root = treeOf((1..99).toList())
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 노드 최대(100개) 완전 이진 트리
    @Test
    fun `example 26`() {
        val root = treeOf((1..100).toList())
        assertThat(sut.isCompleteTree(root), `is`(true))
    }

    // 노드 최대(100개) 중간 하나 비어있음
    @Test
    fun `example 27`() {
        val root = treeOf((1..50).toList() + null + (52..101).toList())
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 노드 최대(100개) 왼쪽 사슬
    @Test
    fun `example 28`() {
        val root = treeOf(listOf<Int?>(1) + (2..100).flatMap { listOf(it, null) }.dropLast(1))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 노드 최대(100개) 마지막 노드만 오른쪽 자식
    @Test
    fun `example 29`() {
        val root = treeOf((1..99).toList() + null + 100)
        assertThat(sut.isCompleteTree(root), `is`(false))
    }

    // 높이 3 오른쪽 자식 없이 마지막 레벨 존재
    @Test
    fun `example 30`() {
        val root = treeOf(listOf(1, 2, null, 4, 5))
        assertThat(sut.isCompleteTree(root), `is`(false))
    }
}
