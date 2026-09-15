package com.leetcode

// https://github.com/antop-dev/algorithm/issues/788
class P835 {
    fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
        val n = img1.size
        if (n == 1) { // 1x1 은 바로 비교
            return img1[0][0] * img2[0][0]
        }
        // 움직이면서 비교
        val img3 = img3(img1, n)
        var ans = 0
        for (i in 1 until n * 2) {
            for (j in 1 until n * 2) {
                val count = check(n, img3, i, j, img2)
                ans = maxOf(ans, count)
            }
        }
        return ans
    }

    // img1 크기 * 3 크기의 판을 만든다.
    private fun img3(img: Array<IntArray>, n: Int): Array<IntArray> {
        val img3 = Array(n * 3) { IntArray(n * 3) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                img3[i + n][j + n] = img[i][j]
            }
        }
        return img3
    }

    // 오버랩되는 갯수 세기
    private fun check(n: Int, img3: Array<IntArray>, i3: Int, j3: Int, img2: Array<IntArray>): Int {
        var count = 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (img3[i3 + i][j3 + j] == 1 && img2[i][j] == 1) {
                    count++
                }
            }
        }
        return count
    }
}
