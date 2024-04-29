package kr.co.programmers;

import java.util.PriorityQueue;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/553
public class P12927 {
    public long solution(int n, int[] works) {
        long sum = 0L;
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> works[o2] - works[o1]);
        for (int i = 0; i < works.length; i++) {
            pq.offer(i);
            sum += works[i];
        }

        if (n > sum) {
            return 0;
        }

        while (n-- > 0 && !pq.isEmpty()) {
            int poll = pq.poll();
            works[poll]--;
            pq.offer(poll);
        }

        long ans = 0L;
        for (int v : works) {
            sum += v;
            ans += (long) v * v;
        }
        return ans;
    }
}
