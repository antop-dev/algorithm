package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class P12899 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n >= 3) {
            int remainder = n % 3; // 3으로 나눈 나머지
            n = n / 3; // 3으로 나눈 몫

            if (remainder == 0) { // 나머지가 0일 경우 몫에서 1을 빼고 4로 바꾼다.
                n -= 1;
                remainder = 4;
            }
            answer.insert(0, remainder);
        }

        if (n > 0) { // 남은 몫을 앞에 붙여준다.
            answer.insert(0, n);
        }

        return answer.toString();
    }
}
