package kr.co.programmers;

import java.util.PriorityQueue;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class P138477 {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) { // 안해도 되지만 경고 나서 함..
                answer[i] = pq.peek();
            }
        }
        return answer;
    }

}
