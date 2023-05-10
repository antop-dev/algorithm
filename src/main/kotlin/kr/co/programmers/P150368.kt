package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/488
class P150368 {
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        val answer = intArrayOf(0, 0)
        // 모든 조합으로 구매를 계산한다.
        val combinations = combinations(emoticons.size)
        for (comb in combinations) {
            var subscribe = 0 // 총 이모티콘 플러스 서비스 가입자수
            var total = 0 // 총 판매 금액
            for (user in users) {
                var amount = 0 // 유저의 총 구매 금액
                for (i in emoticons.indices) {
                    // 할인율이 사용자의 기준 이상이면 구매
                    if (comb[i] >= user[0]) {
                        amount += emoticons[i] * (100 - comb[i]) / 100
                    }
                    // 사용자의 총 구매 금액이 기준 금액을 넘으면 서비스 가입으로 전환
                    if (amount >= user[1]) {
                        subscribe++
                        amount = 0
                        break
                    }
                }
                total += amount // 총 만패 금액에 합산
            }
            // 교체 기준
            if (subscribe > answer[0]) {
                answer[0] = subscribe
                answer[1] = total
            } else if (subscribe == answer[0] && total > answer[1]) {
                answer[1] = total
            }
        }

        return answer
    }

    private fun combinations(n: Int): List<List<Int>> {
        val combinations = mutableListOf<List<Int>>()
        backtrack(combinations, mutableListOf(), n)
        return combinations
    }

    private fun backtrack(combinations: MutableList<List<Int>>, current: MutableList<Int>, N: Int) {
        if (current.size == N) {
            combinations.add(current.toList())
            return
        }

        val numbers = listOf(10, 20, 30, 40)
        for (number in numbers) {
            current.add(number)
            backtrack(combinations, current, N)
            current.removeAt(current.size - 1)
        }
    }
}
