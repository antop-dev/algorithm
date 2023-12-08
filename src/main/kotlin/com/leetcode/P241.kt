package com.leetcode

// https://leetcode.com/problems/different-ways-to-add-parentheses/
class P241 {
    private val ops = setOf('+', '-', '*')

    fun diffWaysToCompute(expression: String): List<Int> {
        val values = mutableListOf<Int>()
        // 연산자를 만나면 왼쪽 계산식과 오른쪽 계산식을 나눠서 재귀
        expression.forEachIndexed { i, ch ->
            if (ch in ops) {
                val left = diffWaysToCompute(expression.substring(0, i))
                val right = diffWaysToCompute(expression.substring(i + 1))
                values += merge(left, right, ch)
            }
        }
        // 연산자가 없고 숫자만 있을 경우
        if (values.isEmpty()) {
            values += expression.toInt()
        }
        return values
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
