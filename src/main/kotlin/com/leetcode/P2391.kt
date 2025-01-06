package com.leetcode

// https://github.com/antop-dev/algorithm/issues/616
class P2391 {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        // [금속(M), 종이(P), 유리(G), 종이]
        val type = arrayOf('M', 'P', 'G')
        val count = intArrayOf(0, 0, 0)
        val maxIndex = intArrayOf(0, 0, 0)
        // 각 쓰래기 타입의 개수와 마지막 쓰래기가 있는 집의 인덱스를 구한다.
        for (i in garbage.indices) {
            for (j in garbage[i].indices) {
                for (k in type.indices) {
                    val ch = type[k]
                    if (garbage[i][j] == ch) {
                        count[k]++
                        maxIndex[k] = i - 1 // 첫번째 집만 쓰래기가 있을 경우 -1
                    }
                }
            }
        }
        // 트럭의 이동시간을 누적합으로 만든다
        val prefixSum = prefixSum(travel)
        // 쓰래기 수거 시간 계산
        return minutes(prefixSum, count, maxIndex)
    }

    private fun prefixSum(travel: IntArray): IntArray {
        val prefixSum = IntArray(travel.size)
        prefixSum[0] = travel[0]
        for (i in 1 until travel.size) {
            prefixSum[i] = prefixSum[i - 1] + travel[i]
        }
        return prefixSum;
    }

    private fun minutes(travel: IntArray, count: IntArray, maxIndex: IntArray): Int {
        var ans = 0
        for (i in 0 until 3) {
            if (count[i] > 0) {
                ans += count[i]
                if (maxIndex[i] > -1) {
                    ans += travel[maxIndex[i]]
                }
            }

        }
        return ans
    }
}
