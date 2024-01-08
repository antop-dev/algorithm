package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/437
class P138476 {
    fun solution(k: Int, tangerine: IntArray): Int {
        var ans = 0 // 귤의 크기 종류 수
        var box = 0 // 상자에 담은 귤 수

        tangerine
            .toTypedArray()
            .groupingBy { it }
            .eachCount() // 크기 : 개수
            .entries.sortedByDescending { it.value }
            .forEach { (_, v) ->
                if (box >= k) return@forEach
                ans++
                box += v
            }

        return ans
    }

}
