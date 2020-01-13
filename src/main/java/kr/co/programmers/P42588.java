package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42588
 */
public class P42588 {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] > heights[i]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}
