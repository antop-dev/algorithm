package com.leetcode

// https://github.com/antop-dev/algorithm/issues/561
class P1282 {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        return (groupSizes.indices)
            .groupBy { groupSizes[it] }
            .flatMap { it.value.chunked(it.key) }
    }
}
