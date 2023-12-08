package com.leetcode

// https://leetcode.com/problems/different-ways-to-add-parentheses/
class P241 {
    private val ops = setOf('+', '-', '*')

    fun diffWaysToCompute(expression: String, memo: Map<String, List<Int>> = mutableMapOf()): List<Int> {
        return memo[expression]?.run { // 메모이제이션(memoization)
            this
        } ?: run {
            // 신규 계산식
            val values = mutableListOf<Int>()
            // 연산자를 만나면 왼쪽 계산식과 오른쪽 계산식을 나눠서 재귀
            expression.forEachIndexed { i, ch ->
                if (ch in ops) {
                    val left = diffWaysToCompute(expression.substring(0, i), memo)
                    val right = diffWaysToCompute(expression.substring(i + 1), memo)
                    values += merge(left, right, ch)
                }
            }
            // 연산자가 없고 숫자만 있을 경우
            if (values.isEmpty()) {
                values += expression.toInt()
            }
            values
        }
    }

    private fun merge(left: List<Int>, right: List<Int>, op: Char) = mutableListOf<Int>().apply {
        for (l in left) {
            for (r in right) {
                when (op) {
                    '+' -> this += l + r
                    '-' -> this += l - r
                    '*' -> this += l * r
                }
            }
        }
    }

}
