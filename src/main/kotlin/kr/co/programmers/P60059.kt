package kr.co.programmers

// https://school.programmers.co.kr/learn/courses/30/lessons/60059
class P60059 {
    fun solution(k: Array<IntArray>, lock: Array<IntArray>): Boolean {
        var key = k
        repeat(4) { // 키를 4번 회전면서 체크한다.
            if (check(key, lock)) {
                return true
            }
            // 키를 오른쪽으로 90도 회전
            key = turn(key)
        }
        return false
    }

    private fun check(key: Array<IntArray>, lock: Array<IntArray>): Boolean {
        val n = lock.size
        val m = key.size
        val len = (n + n - 1)
        val loop = len * len
        var i = 0
        while (i < loop) {
            val x = (i % len) + n - m + 1
            val y = (i / len) + n - m + 1
            if (verify(key, lock, y, x)) {
                return true
            }
            i++
        }
        return false
    }

    /**
     * 자물쇠([lock])와 열쇠([key])에서 겹쳐지는 부분 계산
     */
    private fun verify(key: Array<IntArray>, lock: Array<IntArray>, y: Int, x: Int): Boolean {
        val m = key.size
        val n = lock.size
        val copiedLock = lock.map { it.copyOf() }
        for (i in y until y + m) {
            for (j in x until x + m) {
                // 자물쇠에 해당하는 부분만 계산
                if (i in n until n + n && j in n until n + n) {
                    copiedLock[i - n][j - n] += key[i - y][j - x]
                }
            }
        }
        // 자물쇠의 모든 칸이 1이면 OK
        return copiedLock.all { it.all { v -> v == 1 } }
    }

    /** 키를 오른쪽으로 90도 회전 */
    private fun turn(key: Array<IntArray>): Array<IntArray> {
        val n = key.size
        val turned = Array(n) { IntArray(n) }
        for (r in 0 until n) {
            for (c in 0 until n) {
                turned[c][n - r - 1] = key[r][c]
            }
        }
        return turned
    }

}
