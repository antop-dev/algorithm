package com.leetcode

import java.util.*
import kotlin.math.sqrt

// https://github.com/antop-dev/algorithm/issues/495
class P279 {
    fun numSquares(n: Int): Int {
        // 중복된 수를 제거하기 위한 Set
        val set = mutableSetOf<Int>()
        set += n
        // 큐
        val queue = LinkedList<Int>()
        queue += n
        // 계산
        var count = 0
        loop@ while (queue.isNotEmpty()) {
            count++
            println("count = $count, queue = $queue")
            val size = queue.size
            for (i in 0 until size) {
                val v = queue.poll()
                // 가능한 가장 큰 제곱수
                val sqrt = sqrt(v.toDouble()).toInt()
                for (x in sqrt downTo 1) {
                    val y = v - (x * x)
                    if (y == 0) break@loop
                    if (y !in set) {
                        queue += y
                        set += y
                    }
                }
            }
        }
        return count
    }

}
