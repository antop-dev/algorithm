package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/64061?language=kotlin
class P64061 {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        // map[위치][목록] 으로 변환
        val loc = mutableMapOf<Int, MutableList<Int>>().apply {
            for (i in 1..board.size) this[i] = mutableListOf()
        }.apply {
            for (i in board.indices) {
                for (j in board[i].indices) {
                    if (board[i][j] != 0) {
                        this[j + 1]!!.add(board[i][j])
                    }
                }
            }
        }

        var answer = 0
        val basket = mutableListOf<Int>()
        for (pos in moves) { // 인형 뽑기
            if (loc[pos]!!.size == 0) continue
            val doll = loc[pos]!!.removeAt(0)
            if (basket.isNotEmpty() && basket.last() == doll) {
                basket.removeAt(basket.lastIndex)
                answer += 2
            } else {
                basket.add(doll)
            }
        }

        return answer
    }
}