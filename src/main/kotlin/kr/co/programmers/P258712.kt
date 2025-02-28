package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/628
class P258712 {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val n = friends.size
        // 주고 받은 이력
        val table = Array(n) { IntArray(n) }
        // 선물 지수
        val score = IntArray(n)
        // 이름 -> 인덱스
        val dict = friends.mapIndexed { i, name -> name to i }.toMap()
        // 선물 주고 받은 기록
        gifts
            .map { it.split(" ") }
            .map { (a, b) -> dict[a]!! to dict[b]!! }
            .forEach { (a, b) ->
                table[a][b]++ // A가 B에게 준 선물 수
                // 선물 지수
                score[a]++ // 주면 +
                score[b]-- // 받으면 -
            }

        var ans = 0
        for (a in friends.indices) {
            var receive = 0 // a가 받아야 할 선물 수
            for (b in friends.indices) {
                if (
                    a != b // 나 자신은 패스
                    && table[a][b] > table[b][a] // A가 B에게 준 선물 수가 많은 경우
                    || (table[a][b] == table[b][a] && score[a] > score[b]) // A와 B가 서로 준 선물 수가 같고 A가 선물 지수가 더 높은 경우
                ) {
                    receive++
                }
            }
            ans = maxOf(ans, receive) // 가장 많이 받는 선물 수만 알면 된다.
        }
        return ans
    }
}
