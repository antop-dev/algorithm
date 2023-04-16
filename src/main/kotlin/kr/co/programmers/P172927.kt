package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/481
class P172927 {

    fun solution(picks: IntArray, minerals: Array<String>): Int {
        // 곡괭이의 수만큼 5칸마다 구간의 합(가중치)을 구한다.
        val mines = mutableListOf<IntArray>()
        var numOfPick = picks[0] + picks[1] + picks[2]
        for (i in minerals.indices step 5) {
            // 곡괭이의 수만큼 계산
            if (numOfPick <= 0) break
            // [0] : 다이아몬드 광석 수
            // [1] : 철 광석 수
            // [2] : 돌 광석 수
            // [3] : 가중치
            val mine = IntArray(4)
            for (j in i until minOf(i + 5, minerals.size)) {
                when (minerals[j]) {
                    "diamond" -> {
                        mine[0]++
                        mine[3] += 25
                    }

                    "iron" -> {
                        mine[1]++
                        mine[3] += 5
                    }

                    "stone" -> {
                        mine[2]++
                        mine[3] += 1
                    }
                }
            }
            mines += mine
            numOfPick--
        }
        // 기중치로 내림차순 정렬
        mines.sortByDescending { it[3] }
        // 최소 피로도 계산
        var answer = 0
        for (mine in mines) {
            val (diamond, iron, stone) = mine
            answer += when {
                picks[0] > 0 -> {
                    picks[0]--
                    diamond + iron + stone
                }

                picks[1] > 0 -> {
                    picks[1]--
                    (diamond * 5) + iron + stone
                }

                picks[2] > 0 -> {
                    picks[0]--
                    (diamond * 25) + (iron * 5) + stone
                }

                else -> 0
            }
        }

        return answer
    }

}
