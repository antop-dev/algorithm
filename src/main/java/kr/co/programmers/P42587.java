package kr.co.programmers;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class P42587 {
    /**
     * @param priorities 중요도 배열
     * @param location   나의 작업이 있는 배열 인덱스
     * @return
     */
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // array -> queue
        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }

        while (location >= 0) {
            System.out.println();
            System.out.println("queue = " + queue);
            System.out.println("location = " + location);

            int n = queue.poll(); // 대기열에서 첫번째 작업을 뺀다.
            boolean find = false;

            for (int priority : queue) { // 자기보다 중요도가 큰 작업이 잇는지 찾는다.
                if (priority > n) {
                    find = true;
                    break;
                }
            }

            if (find) { // 뽑아낸 작업의 중요도가 가장 큰 중요도가 아니라면
                queue.offer(n); // 뽑은 작업을 마지막에 넣는다.
                if (location == 0) { // 나의 작업이 맨 뒤로 간 경우 위치값도 같이 맨 뒤로 이동
                    location = queue.size();
                }
            } else { // 없다면 (현재 작업이 가장 중요도가 잇는 작업이라면)
                answer++; // 인쇄를 한번 수행 했다.
                if (location == 0) { // 가장 중요도가 큰 작업이 0번 째이면 끝
                    break;
                }
            }

            location--;
        }

        System.out.println();
        System.out.println("done.");

        return answer;
    }
}
