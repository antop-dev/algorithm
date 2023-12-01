package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/521
class P12946 {
    fun solution(n: Int): Array<IntArray> {
        val ans = mutableListOf<IntArray>()
        move(ans, n, 1, 2, 3)
        return ans.toTypedArray()
    }

    private fun move(ans: MutableList<IntArray>, n: Int, from: Int, mid: Int, to: Int) {
        if (n == 1) {
            ans += intArrayOf(from, to)
            return
        }
        // 1번 기둥의 n-1개를 3번을 걸쳐 2번으로 이동시킴
        move(ans, n - 1, from, to, mid)
        // 가장 큰 n을 1에서 3으로 이동시킴
        ans += intArrayOf(from, to)
        // 2번의 기둥의 n-1개를 1번을 걸쳐 3번으로 이동시킴
        move(ans, n - 1, mid, from, to)
    }

}
