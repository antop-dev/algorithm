package kr.co.programmers;

import java.util.PriorityQueue;

// https://github.com/antop-dev/algorithm/issues/583
public class P42626 {
    public int solution(int[] scoville, int k) {
        // 초기화
        var pq = new PriorityQueue<Integer>();
        for (var v : scoville) {
            pq.offer(v);
        }
        // 섞기
        var ans = 0;
        while (pq.size() >= 2 && pq.peek() < k) {
            var mix = pq.poll() + (pq.poll() * 2);
            pq.offer(mix);
            ans++;
        }
        // 모든 음식의 스코빌 지수를 K로 만들 수 없는 경우
        if (pq.size() == 1 && pq.peek() < k) {
            ans = -1;
        }
        return ans;
    }
}
