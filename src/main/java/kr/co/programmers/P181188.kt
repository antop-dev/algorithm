package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/500
class P181188 {
    fun solution(targets: Array<IntArray>): Int {
        // 개구간 시작 좌표로 오름차순 정렬
        targets.sortBy { (s, _) -> s }
        // 계산
        var ans = 1
        var end = targets[0][1]
        for (i in 1 until targets.size) {
            val (s, e) = targets[i]
            if (s < end) { // 겹친다.
                end = minOf(end, e)
            } else { // 겹치지 않는다.
                println("겹치지 않는다. -> ${s}, ${e}")
                ans++
                end = e
            }
        }
        return ans
    }
}
