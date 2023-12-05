package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/524
class P42628 {

    fun solution(operations: Array<String>): IntArray {
        val list = LinkedList<Int>()
        val ops = operations.map { parse(it) }
        for ((op, v) in ops) {
            if (op == "I") { // 추가
                list += v
                list.sort()
            } else if (list.isNotEmpty()) { // 삭제
                if (v == -1) { // 최솟값 삭제
                    list.removeFirst()
                } else { // 최댓값 삭제
                    list.removeLast()

                }
            }

        }

        return intArrayOf(
            list.lastOrNull() ?: 0,
            list.firstOrNull() ?: 0
        )
    }

    private fun parse(s: String) = s.split(" ")
        .let { (op, v) -> op to v.toInt() }

}
