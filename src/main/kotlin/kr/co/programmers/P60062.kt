package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/778
class P60062 {
    fun solution(n: Int, weak: IntArray, dist: IntArray): Int {
        // 순환하는 배열을 처리하기 위해서 2배 길이 배열로 처리한다.
        val weaks = IntArray(weak.size * 2)
        for (i in weak.indices) {
            weaks[i] = weak[i]
            weaks[i + weak.size] = weak[i] + n
        }

        println("${weak.contentToString()} → ${weaks.contentToString()}")

        var ans = Int.MAX_VALUE
        for (i in weak.indices) {
            val check = dfs(weaks, i, i + weak.size - 1, dist, BooleanArray(dist.size), 0)
            println("${i} → ${i + weak.size - 1} : ${check}")
            if (check != -1 && check < ans) {
                ans = check
            }
        }

        if (ans == Int.MAX_VALUE) {
            ans = -1
        }
        return ans
    }

    /**
     * start ~ end 위치까지 아직 점검하지 않는 친구들로 이동할 수 있는 경우의 수 중 가장 적은 친구 수를 반환한다.
     *
     * @param weaks 취약점 위치
     * @param start 시작 위치
     * @param end 끝 위치
     * @param friends 친구들의 순찰 거리
     * @param used 친구들이 사용되었는지 여부
     * @param count 현재까지 사용한 친구 수
     */
    private fun dfs(weaks: IntArray, start: Int, end: Int, friends: IntArray, used: BooleanArray, count: Int): Int {
        if (start > end) {
            return count
        }

        var minCount = Int.MAX_VALUE
        for (i in friends.indices) {
            if (used[i]) {
                continue
            }
            // 이 친구가 어디까지 갈 수 있는가?
            val coverEnd = weaks[start] + friends[i] // 갈 수 있는 거리
            var nextStart = start
            while (nextStart <= end && weaks[nextStart] <= coverEnd) {
                nextStart++
            }

            // friends[i] 친구가 start ~ nextStart - 1 까지 순찰을 했다.
            // nextStart ~ end 까지 점검하지 않은 친구들로 이동한다.
            used[i] = true
            val result = dfs(weaks, nextStart, end, friends, used, count + 1)
            used[i] = false // backtracking

            minCount = minOf(minCount, result)
        }
        return minCount
    }
}
