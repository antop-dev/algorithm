package kr.co.programmers

import kotlin.math.ceil

// https://github.com/antop-dev/algorithm/issues/254
class P77486 {

    fun solution(enroll: Array<String>, referral: Array<String>, seller: Array<String>, amount: IntArray): IntArray {
        val profit = IntArray(enroll.size) { 0 }
        for (i in seller.indices) {
            f(profit, enroll, referral, seller[i], amount[i] * 100)
        }
        return profit
    }

    private fun f(profit: IntArray, enroll: Array<String>, referral: Array<String>, seller: String, amount: Int) {
        if (seller == "-") return
        val i = enroll.indexOf(seller)
        val p = ceil(amount * 0.9).toInt()
        profit[i] += p
        f(profit, enroll, referral, referral[i], amount - p)
    }

}
