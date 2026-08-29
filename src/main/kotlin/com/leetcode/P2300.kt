package com.leetcode

// https://github.com/antop-dev/algorithm/issues/780
class P2300 {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        val ans = IntArray(spells.size)
        for (i in spells.indices) {
            val j = find(spells[i], potions, success)
            ans[i] = potions.size - j
        }
        return ans
    }

    // spell * potions[mid] >= success 인 가장 작은 인덱스를 찾는다.
    private fun find(spell: Int, potions: IntArray, success: Long): Int {
        var left = 0
        var right = potions.lastIndex
        var result = potions.size

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (spell.toLong() * potions[mid] >= success) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return result
    }
}
