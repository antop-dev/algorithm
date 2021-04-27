package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/252
class P77484 {

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var unknown = 0
        var match = 0
        for (n in lottos) {
            if (n > 0) {
                if (n in win_nums) match++
            } else {
                unknown++
            }
        }
        return intArrayOf(
            (7 - (unknown + match)).run { if (this > 6) 6 else this },
            (7 - match).run { if (this > 6) 6 else this }
        )
    }
}
