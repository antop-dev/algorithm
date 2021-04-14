package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/42583
class P42583 {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var sec = 0 // 경과 시간
        var done = 0 // 다리를 지난 트럭 수
        var i = 0 // 대기 트럭 인덱스
        var total = 0 // 다리를 건너고 있는 트럭들의 총 무게
        // 다리 상황
        // [0] : 트럭 무게
        // [1] : 트력이 움직인 거리
        val bridge = mutableListOf<IntArray>()

        while (done < truck_weights.size) {
            sec++
            // 다리 위에 있는 트력 한칸씩 이동
            bridge.forEach { it[1]++ }
            // 맨 앞 트럭 빼기
            if (bridge.isNotEmpty() && bridge[0][1] > bridge_length) {
                total -= bridge.removeAt(0)[0]
                done++
            }
            // 대기 트럭 다리로 올리기
            if (i < truck_weights.size && total + truck_weights[i] <= weight) {
                val truck = truck_weights[i]
                bridge += intArrayOf(truck, 1)
                total += truck
                i++
            }
        }
        return sec
    }
}
