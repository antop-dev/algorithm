package kr.co.programmers

import java.math.BigInteger

// https://github.com/antop-dev/algorithm/issues/403
class P92335 {

    fun solution(n: Int, k: Int): Int {
        val teen = BigInteger.valueOf(10)
        var answer = 0
        // n.toString(k)
        val kNumber = decimalToK(n, k) + "0"
        var num = BigInteger.ZERO
        for (c in kNumber) {
            num = when {
                (c == '0' && num != BigInteger.ZERO) -> {
                    if (isPrime(num)) answer++
                    BigInteger.ZERO
                }
                else -> num.multiply(teen).add(BigInteger("${c - '0'}"))
            }
        }
        return answer
    }

    private fun decimalToK(n: Int, k: Int) = StringBuffer().apply {
        var m = n
        while (m >= k) {
            insert(0, m % k)
            m /= k
        }
        insert(0, m)
    }.toString()

    private fun isPrime(n: BigInteger): Boolean {
        if (n == BigInteger.ZERO || n == BigInteger.ONE) return false
        for (i in 2 until n.sqrt().toLong() + 1) {
            if (n.mod(BigInteger.valueOf(i)) == BigInteger.ZERO) {
                return false
            }
        }
        return true
    }

}
