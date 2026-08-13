package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/774
class P131129 {
    fun solution(target: Int): IntArray {
        var ans = intArrayOf(100_000, 100_000)
        for (bull in (target / 50) downTo 0) {
            val result = count(target, bull)
            // 횟수가 더 적거나 불or싱글이 더 많으면 교체
            if (result[0] < ans[0] || (result[0] == ans[0] && result[1] > ans[0])) {
                ans = result
            }
        }
        return ans
    }

    private fun count(target: Int, bull: Int): IntArray {
        var count = bull
        var bullOrOne = bull
        var remain = target - (50 * bull)
        while (remain > 0) {
            // 남은 점수 구간에 따라 판단한다.
            when {
                // 60점까지는 20점 트리틀만 던진다.
                remain >= 60 -> remain -= 60
                // 41 ~ 59
                remain > 40 -> remain -= (remain / 3) * 3
                // 21 ~ 40
                remain > 20 -> {
                    // 트리플이나 더블로 끝나면 던지고 아니면 싱글을 던진다.
                    if (remain % 3 == 0 || remain % 2 == 0) {
                        remain = 0
                    } else {
                        remain = 20
                        bullOrOne++
                    }
                }
                // 1 ~ 20
                else -> {
                    remain = 0
                    bullOrOne++
                }
            }
            count++
        }
        return intArrayOf(count, bullOrOne)
    }
}
