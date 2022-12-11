package kr.co.programmers

import java.math.BigInteger

// https://github.com/antop-dev/algorithm/issues/403
class P92335 {
    companion object {
        val TEEN: BigInteger = BigInteger("10")
    }

    fun solution(n: Int, k: Int): Int {

        var answer = 0
        val kNumber = decimalToK(n, k) + "0" // n.toString(k) + "0"
        var num = BigInteger.ZERO
        for (ch in kNumber) { // 한 문자씩 탐색
            val n = ch - '0'
            num = if (n == 0 && num != BigInteger.ZERO) { // 조건에 맞는 경우
                if (isPrime(num)) { // 소수인지 판단
                    answer++
                }
                BigInteger.ZERO // 수 초기화
            } else { // 숫자를 완성해 나간다.
                // num = (num * 10) + n
                (num * TEEN) + BigInteger("$n")
            }
        }
        return answer
    }

    // 10진수를 k진수로 변환
    private fun decimalToK(n: Int, k: Int): String {
        val sb = StringBuilder()
        var num = n
        while (num >= k) {
            sb.insert(0, num % k)
            num /= k
        }
        sb.insert(0, num)
        return sb.toString()
    }

    // 소수인지 판단
    private fun isPrime(num: BigInteger): Boolean {
        if (num <= BigInteger.ONE) {
            return false
        }
        for (n in 2 until num.sqrt().toLong() + 1) {
            // 나눠지면 소수가 아니다
            if (num.mod(BigInteger("$n")) == BigInteger.ZERO) {
                return false
            }
        }
        return true
    }

}
