package kr.co.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/553
public class P12927 {
    public long solution(int n, int[] works) {
        Queue<Integer> pq = priorityQueue(works);
        work(pq, n);
        return fatigue(pq);
    }

    private Queue<Integer> priorityQueue(int[] works) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int v : works) {
            pq.offer(v);
        }
        return pq;
    }

    private void work(Queue<Integer> queue, int n) {
        while (n-- > 0 && !queue.isEmpty()) {
            int v = queue.poll();
            if (v > 0) v--;
            queue.offer(v);
        }
    }

    private long fatigue(Queue<Integer> queue) {
        long fatigue = 0L;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            fatigue += (long) v * v;
        }
        return fatigue;
    }
}
