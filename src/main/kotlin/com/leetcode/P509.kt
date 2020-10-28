package com.leetcode

// https://leetcode.com/problems/fibonacci-number/
class P509 {
    fun fib(N: Int): Int {
        if (N <= 1) return N
        return fib(N - 1) + fib(N - 2)
    }
}
