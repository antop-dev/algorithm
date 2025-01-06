package com.leetcode

// https://github.com/antop-dev/algorithm/issues/617
class P3309 {
    fun maxGoodNumber(nums: IntArray): Int {
        return permutations(nums)
    }

    // 스왑 방식 순열
    private fun permutations(nums: IntArray, start: Int = 0): Int {
        if (start == nums.size) { // 순열 완성
            return binaryAndDecimal(nums)
        }

        var max = 0
        for (i in start until nums.size) {
            nums.swap(start, i) // 스왑
            val v = permutations(nums, start + 1) // 재귀 호출
            max = maxOf(max, v) // 최대값 갱신
            nums.swap(start, i) // 원상복구 (백트래킹)
        }
        return max
    }

    // 2진수로 만들어 붙이고 10진수로 변환
    private fun binaryAndDecimal(nums: IntArray) =
        nums.joinToString("") { it.toString(2) }.toInt(2)

    // 배열의 요소를 스왑하는 확장 함수
    private fun IntArray.swap(i: Int, j: Int) {
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }
}
