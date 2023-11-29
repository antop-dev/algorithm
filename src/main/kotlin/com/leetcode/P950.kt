package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/523
class P950 {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        val order = LinkedList<Int>()
        for (i in deck.indices) {
            order += i
        }
        deck.sort()
        val ans = IntArray(deck.size)
        for (n in deck) {
            ans[order.poll()] = n
            if (order.isNotEmpty()) {
                order += order.poll()
            }
        }
        return ans
    }

}
