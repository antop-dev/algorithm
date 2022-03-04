package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/380
class P42839 {

    fun solution(numbers: String): Int {
        val set = mutableSetOf<Int>()
        // "17" -> [1, 7]
        val nums = numbers.map { it.toInt() - 48 }.toMutableList()
        dfs(set, nums, 0)
        return set.count { prime(it) }
    }

    private fun dfs(set: MutableSet<Int>, nums: MutableList<Int>, n: Int) {
        if (n > 0 && !set.contains(n)) set += n
        if (nums.isEmpty()) return

        val size = nums.size
        repeat(size) {
            val v = nums.removeAt(0)
            val num = (n * 10) + v
            dfs(set, nums, num)
            nums += v
        }
    }

    private fun prime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2 until n) {
            if (n % i == 0) return false
        }
        return true
    }

}
