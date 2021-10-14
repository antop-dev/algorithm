package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/338
class P42895 {

    fun solution(N: Int, number: Int): Int {
        if (N == number) return 1
        // ignore index 0
        val dp = Array(9) { mutableSetOf<Long>() }
        dp[1].add(N.toLong())

        for (n in 2 until dp.size) {
            val set: MutableSet<Long> = dp[n]
            // NNNNN
            set.add(run {
                var v = N
                repeat(n - 1) {
                    v = (v * 10) + N
                }
                v.toLong()
            })

            for (left in 1..n / 2) {
                val right = n - left
                for (x in dp[left]) {
                    for (y in dp[right]) {
                        set.add(x * y) // equals y * x
                        set.add(x + y) // equals y + x
                        set.add(x - y)
                        set.add(y - x)
                        if (y > 0) set.add(x / y)
                        if (x > 0) set.add(y / x)

                        if (set.contains(number.toLong())) {
                            return n
                        }
                    }
                }
            }
        }

        return -1
    }

}
