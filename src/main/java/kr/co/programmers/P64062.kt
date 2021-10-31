package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/343
class P64062 {
    fun solution(stones: IntArray, k: Int): Int {
        var s = stones.min()!!
        var e = stones.max()!!

        while (s <= e) {
            val m = (s + e) / 2 // 몇 명이 건널 것인가?
            // m 명이 건넌다고 했을 때 다 쓴 연속된 징검다리의 최대 길이를 구한다.
            val dist = run {
                var max = 0
                var d = 0
                for (i in stones.indices) {
                    if (stones[i] - m <= 0) d++
                    else {
                        if (d > max) max = d
                        d = 0
                    }
                }
                if (d > max) d else max
            }
            // 길이와 k를 비교하여 범위 조정
            if (dist < k) s = m + 1
            else e = m - 1
        }

        return s
    }
}
