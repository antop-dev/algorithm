package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/635
class P388352 {
    fun solution(n: Int, q: Array<IntArray>, ans: IntArray): Int {
        val arr = IntArray(5)
        return helper(n, q, ans, arr, 0, 0)
    }

    private fun helper(n: Int, q: Array<IntArray>, ans: IntArray, arr: IntArray, pos: Int, v: Int): Int {
        if (pos == 5) {
            return if (check(q, ans, arr)) 1 else 0
        }
        var count = 0
        for (x in (v + 1)..n) {
            arr[pos] = x
            count += helper(n, q, ans, arr, pos + 1, x)
        }
        return count
    }

    // q[i]와 arr의 일치하는 값 개수가 ans[i]와 모두 일치하는지 체크
    private fun check(q: Array<IntArray>, ans: IntArray, arr: IntArray): Boolean {
        for (i in q.indices) {
            if (countSame(q[i], arr) != ans[i]) {
                return false
            }
        }
        return true
    }

    // 오름차순으로 정렬된 두 배열에서 같은 값의 개수를 구한다.
    private fun countSame(x: IntArray, y: IntArray): Int {
        var count = 0
        var i = 0
        var j = 0
        while (i < x.size && j < y.size) {
            when {
                x[i] < y[j] -> i++
                x[i] > y[j] -> j++
                else -> { // x[i] == y[j]
                    count++
                    i++
                    j++
                }
            }
        }
        return count
    }
}
