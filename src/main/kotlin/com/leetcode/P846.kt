package com.leetcode

// https://github.com/antop-dev/algorithm/issues/713
class P846 {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if (hand.size % groupSize != 0) {
            return false
        }
        // 카드 번호당 갯수
        // 키가 정렬되는 맵 자료구조를 이용해서 카드 번호를 정렬한다.
        val counter = hand.toTypedArray().groupingBy { it }.eachCount().toSortedMap()
        while (counter.isNotEmpty()) {
            val first = counter.firstKey()
            for (num in first until first + groupSize) {
                val count = counter[num] ?: return false
                if (count == 1) {
                    counter.remove(num)
                } else {
                    counter[num] = count - 1
                }
            }
        }
        return true
    }
}
