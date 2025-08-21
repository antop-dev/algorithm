package com.leetcode

// https://github.com/antop-dev/algorithm/issues/680
class P638 {
    fun shoppingOffers(price: List<Int>, special: List<List<Int>>, needs: List<Int>): Int {
        // 단품 구매도 스페셜에 포함시킨다.
        val items = special + price.mapIndexed { i, p ->
            IntArray(needs.size + 1).apply {
                this[i] = 1
                this[this.lastIndex] = p
            }.toList()
        }
        val memo = mutableMapOf<String, Int>()
        val bestPrice = needs.zip(price).sumOf { (x, y) -> x * y }
        val shopping = IntArray(needs.size + 1) // 현재 구매중인 내역
        return dfs(price, items, needs, memo, bestPrice, shopping)
    }

    private fun dfs(
        price: List<Int>,
        special: List<List<Int>>,
        needs: List<Int>,
        memo: MutableMap<String, Int>,
        bestPrice: Int,
        shopping: IntArray,
    ): Int {
        val key = shopping.joinToString("-")
        // 가지치기: 누적금액이 전에 구해진 답보다 커지면 더이상 내려갈 필요가 없다.
        if (shopping.last() >= bestPrice) {
            return bestPrice
        }
        // 모두 구매 했을 경우
        if (needs == shopping.dropLast(1)) {
            return minOf(bestPrice, shopping.last())
        }
        // 메모제이션에 있는지 체크
        val v = memo[key]
        if (v != null) {
            return v
        }
        // 경우의 수 계산 시작
        var minPrice = bestPrice
        // 스페션 제안 구매
        item@ for (s in special) {
            // 스페셜 제안의 품목을 모두 살 수 있는지 체크
            for (i in 0 until s.size - 1) {
                if (shopping[i] + s[i] > needs[i]) {
                    continue@item
                }
            }
            // 스페셜 제안 구매
            s.forEachIndexed { i, v -> shopping[i] += v }
            // 다음 구매
            val x = dfs(price, special, needs, memo, minPrice, shopping)
            // 다음 구매들 중 최소 구매 비용
            minPrice = minOf(minPrice, x)
            // backtracking
            s.forEachIndexed { i, v -> shopping[i] -= v }
        }
        // 메모제이션
        memo[key] = minPrice

        return minPrice
    }
}