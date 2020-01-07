package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class P12943 {
    public int solution(int num) {
        int answer = 0;

        long n = num;
        while (n > 1) {
            if (answer == 500) {
                return -1;
            }
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            answer++;
        }
        return answer;
    }
}
