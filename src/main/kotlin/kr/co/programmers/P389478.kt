package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/638
class P389478 {
    fun solution(n: Int, w: Int, num: Int): Int {
        val arr = Array(n / w + 1) { IntArray(w) }
        var ans = 0
        var anchor = -1
        var y = 0
        var x = 0
        var curr = 1
        var inc = 1
        // 상자 번호를 채운다.
        while (curr <= n) {
            arr[y][x] = curr
            // 상자 번호가 num에 도달하면 x 좌표를 기억 해둔다.
            if (curr == num) anchor = x
            // 상자의 x 위치가 기억한 위치와 같으면 증가
            if (anchor == x) ans++

            x += inc
            if (x !in 0 until w) {
                x += -inc
                y++
                inc *= -1
            }
            curr++
        }
        return ans
    }
}
