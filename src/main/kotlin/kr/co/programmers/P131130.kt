package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/426
class P131130 {
    fun solution(cards: IntArray): Int {
        var answer = 0
        for (i in cards.indices) {
            val deck = cards.copyOf()
            val first = game(deck, i) // 첫번째 게임 점수
            for (j in cards.indices) {
                val second = game(deck.copyOf(), j) // 두번째 게임 점수
                if (first * second > answer) {
                    answer = first * second
                }
            }
        }
        return answer
    }

    private fun game(cards: IntArray, i: Int): Int {
        var k = i
        var count = 0
        while (cards[k] != 0) {
            count++
            val tmp = cards[k]
            cards[k] = 0
            k = tmp - 1
        }
        return count
    }

}
