package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/437
class P138476 {
    fun solution(k: Int, tangerine: IntArray): Int {
        // 개수가 많은 순서대로 정렬(내림차순)
        val values = tangerine
            .toTypedArray()
            .groupingBy { it }
            .eachCount() // 크기 : 개수
            .values
            .sortedDescending()

        var ans = 0 // 귤의 크기 종류 수
        var box = 0 // 상자에 담은 귤 수
        for (v in values) {
            if (box >= k) break
            ans++
            box += v
        }
        return ans
    }

}
