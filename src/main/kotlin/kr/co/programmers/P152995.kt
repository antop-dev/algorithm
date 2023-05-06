package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/486
class P152995 {
    fun solution(scores: Array<IntArray>): Int {
        var rank = 1
        val me = scores[0]
        var maxScore = 0
        // 근무태도 내림차순 정렬.
        // 근무태도 동점인 경우 동료평가 오름차순 정렬
        scores.sortWith(Comparator { a, b ->
            if (a[0] == b[0]) a[1] - b[1] else b[0] - a[0]
        })

        // 두 점수의 합이 다른 점수의 합보다 크다면
        // 근무태도 또는 동료평가 둘 중 하나는 높다
        for (score in scores) {
            if (score[1] < maxScore) {
                if (score.contentEquals(me)) {
                    return -1
                }
            } else {
                maxScore = maxOf(maxScore, score[1])
                if (score[0] + score[1] > me[0] + me[1]) {
                    rank++
                }
            }
        }

        return rank
    }
}
