package kr.co.programmers;

import java.util.ArrayDeque;
import java.util.Deque;

// https://programmers.co.kr/learn/courses/30/lessons/42584
public class P42584 {
    public int[] solution(int[] prices) {
        int[] ans = new int[prices.length];
        // https://tecoble.techcourse.co.kr/post/2021-05-10-stack-vs-deque/
        // https://www.baeldung.com/java-deque-vs-stack
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();
                ans[j] = i - j;
            }
            stack.push(i);
        }
        // 마지막까지 떨어지지 않은 인덱스들
        while (!stack.isEmpty()) {
            int j = stack.pop();
            ans[j] = prices.length - j - 1;
        }
        return ans;
    }
}
