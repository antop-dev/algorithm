package com.leetcode

// https://leetcode.com/problems/find-the-town-judge/
class P997 {
    fun findJudge(N: Int, trust: Array<IntArray>): Int {
        val box = Array(N) { Array(N) { 0 } }
        for (t in trust) {
            box[t[0] - 1][t[1] - 1] = 1
        }

        loop@ for (i in box.indices) {
            if (box[i].sum() == 0) { // 내가 다른 노드를 믿지 않는다
                for (j in box.indices) { // 나를 제외한 다른 모든 노드가 나를 향하는지 검사
                    if (j == i) continue
                    if (box[j][i] == 0) break@loop
                }
                return i + 1
            }
        }
        return -1
    }
}