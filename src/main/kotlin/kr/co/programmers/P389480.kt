package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/667
class P389480 {
    fun solution(info: Array<IntArray>, n: Int, m: Int): Int {
        val memo = mutableMapOf<String, Int>() // 메모제이션
        val a = dfs(info, n, m, memo, 0, 0, 0)
        return if (a != Int.MAX_VALUE) a else -1
    }

    private fun dfs(info: Array<IntArray>, n: Int, m: Int, memo: MutableMap<String, Int>, i: Int, a: Int, b: Int): Int {
        if (i == info.size) { // 다 훔쳤을 경우
            return a
        }
        // 이미 처리된 결과가 있다면 기록된 결과 리턴
        val key = "$i-$a-$b"
        memo[key]?.let {
            println("memo hit: $key -> $it")
            return it
        }

        var min = Int.MAX_VALUE
        val (x, y) = info[i]
        if (a + x < n) { // A도둑이 훔치는 경우
            min = minOf(min, dfs(info, n, m, memo, i + 1, a + x, b))
        }
        if (b + y < m) { // B도둑이 훔치는 경우
            min = minOf(min, dfs(info, n, m, memo, i + 1, a, b + y))
        }

        println("memo set: $key -> $min")
        memo[key] = min

        return min
    }
}