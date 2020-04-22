package com.leetcode

// https://leetcode.com/problems/flower-planting-with-no-adjacent/
class P1042 {

    fun gardenNoAdj(N: Int, paths: Array<IntArray>): IntArray {
        // 한 가든에서 갈 수 있는 가든 번호를 맵 구조로 가진다.
        val map = mutableMapOf<Int, MutableList<Int>>().apply {
            for (i in 1..N) this[i] = mutableListOf()
        }.apply {
            for (path in paths) {
                this[path[0]]!!.add(path[1])
                this[path[1]]!!.add(path[0])
            }
        }
        // 결과
        val answer = IntArray(N)
        // 1번 가든부터 N번 가든까지 순회
        for (i in 1..N) {
            if (map[i]!!.isEmpty()) { // i번 가든에서 갈 수 있는 가든이 없는 경우
                answer[i - 1] = 1
                continue
            }
            // 나의 주위 노드로부터 1부터 4까지 없는 숫자를 찾는다.
            find@ for (k in 1..4) {
                for (v in map[i]!!) {
                    // 연결된 노드에 찾는 번호가 있을 경우 다음 번호 찾음
                    if (answer[v - 1] == k) continue@find
                }
                // 못찾았을 경우 번호 세팅 후 끝
                answer[i - 1] = k
                break
            }
        }

        return answer
    }

}