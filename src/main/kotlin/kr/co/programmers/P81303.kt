package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/650
class P81303 {
    fun solution(n: Int, k: Int, cmd: Array<String>): String {
        // 테이블 구성
        var row: Node? = null // 현재행
        val table = LinkedList<Node>()
        var prev: Node? = null
        for (i in 0 until n) {
            val node = Node(i)
            if (i > 0) {
                node.up = prev
                prev?.down = node
            }
            table += node
            prev = node
            // 현재 행 기록
            if (i == k) {
                row = node
            }
        }
        // 되돌리기를 위한 스택
        val stack = Stack<Node>()
        // 명령어 수행
        cmd.forEach { comment ->
            val op = comment[0]
            val step = if (comment.length > 1) comment.substring(2).toInt() else 0
            when (op) {
                // 위로 이동
                'U' -> {
                    repeat(step) { row = row?.up }
                }
                // 아래로 이동
                'D' -> {
                    repeat(step) { row = row?.down }
                }
                // 현재 행 삭제
                'C' -> {
                    // 삭제된 행의 위 아래를 서로 참조하도록 함
                    stack += row
                    row?.up?.down = row?.down
                    row?.down?.up = row?.up
                    // 행 선택
                    row = if (row?.down == null) { // 마지막 행을 삭제할 경우 위 행 선택
                        row?.up
                    } else { // 아래 행 선택
                        row?.down
                    }
                }
                // 마지막으로 삭제한 행 복구
                'Z' -> {
                    val node = stack.pop()
                    node.up?.down = node
                    node.down?.up = node
                }
            }
        }

        val chars = CharArray(n) { 'O' }
        while (stack.isNotEmpty()) {
            val i = stack.pop().idx
            chars[i] = 'X'
        }
        return chars.joinToString("")
    }

    class Node(var idx: Int) {
        var up: Node? = null
        var down: Node? = null
    }
}