package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/635
class P388352 {
    fun solution(n: Int, q: Array<IntArray>, ans: IntArray): Int {
        val qBit = q.map { convertBit(it) }
        return helper(n, qBit, ans, 0, 0)
    }

    /**
     * @param make 만들어지고 있는 비트
     * @param v 지금까지 쓰인 수
     */
    private fun helper(n: Int, q: List<Int>, ans: IntArray, make: Int, v: Int): Int {
        if (make.countOneBits() == 5) {
            for (i in q.indices) {
                val match = (q[i] and make).countOneBits()
                if (match != ans[i]) {
                    return 0
                }
            }
            return 1
        }
        var count = 0
        for (x in (v + 1)..n) {
            val newMake = make or (1 shl x)
            count += helper(n, q, ans, newMake, x)
        }
        return count
    }

    // 배열을 비트로 변경
    private fun convertBit(arr: IntArray) = arr.fold(0) { acc, v -> acc or (1 shl v) }

}
