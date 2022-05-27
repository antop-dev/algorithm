package kr.co.programmers

import kotlin.math.ceil

// https://github.com/antop-dev/algorithm/issues/396
class P92341 {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        // 차량의 마지막 입차 시간을 가지고 있는 맵
        val inMap = mutableMapOf<String, Int>()
        // 차량의 누적 주차 시간을 가지고 있는 맵
        val timeMap = mutableMapOf<String, Int>()
        // 차량의 주차 요금
        val moneyMap = mutableMapOf<String, Int>()
        // 누적 주차시간 계산
        for (record in records) {
            val split = record.split(" ")
            val t = split[0].split(":")

            val time = t[0].toInt() * 60 + t[1].toInt() // 숫자로 변환한 시각
            val carNumber = split[1] // 차량번호
            val inOut = split[2] // 내역
            // 누적 주차 시간 0으로 세팅
            if (!timeMap.containsKey(carNumber)) {
                timeMap[carNumber] = 0
            }
            // "OUT" 전에는 반드시 "IN"이 있다.
            if (inOut == "IN") {
                inMap[carNumber] = time
            } else { // "OUT"
                timeMap[carNumber] = timeMap[carNumber]!! + (time - inMap.remove(carNumber)!!)
            }
        }
        // 타임맵에 남아있다면 23:59분 출차로 계산한다.
        for ((carNumber, time) in inMap.entries) {
            timeMap[carNumber] = timeMap[carNumber]!! + (1439 - time)
        }
        // 주차 요금 계산
        for ((carNumber, time) in timeMap.entries) {
            var money = 0.0 + fees[1]
            if (time - fees[0] > 0) {
                money += ceil((time - fees[0]).toDouble() / fees[2]) * fees[3]
            }
            moneyMap[carNumber] = money.toInt()
        }
        // 차량번호로 정렬 후 금액만 리턴
        return moneyMap.toSortedMap().values.toIntArray()
    }

}
