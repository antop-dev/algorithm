package com.leetcode

// https://github.com/antop-dev/algorithm/issues/645
class P1833 {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        val sorted = countingSort(costs)
        var ans = 0
        var sum = 0
        for (cost in sorted) {
            if (sum + cost > coins) {
                break
            }
            ans++
            sum += cost
        }
        return ans
    }

    // https://www.cs.miami.edu/home/burt/learning/Csc517.091/workbook/countingsort.html
    private fun countingSort(input: IntArray): IntArray {
        val counting = IntArray(100_000 + 1)
        val output = IntArray(input.size)
        // 입력에서 각 값이 나타나는 횟수를 센다.
        for (v in input) {
            counting[v]++
        }
        // 계수 배열을 누적합으로 수정
        for (i in 1 until counting.size) {
            counting[i] += counting[i - 1]
        }
        // 계수 배열에서 제공하는 위치에 입력 배열의 숫자를 출력 배열로 전송
        for (i in input.indices.reversed()) {
            val num = input[i]
            output[counting[num] - 1] = num
            counting[num]--
        }
        return output
    }
}
