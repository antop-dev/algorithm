package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class P12925 {
    public int solution(String s) {
        System.out.println("s = " + s);
        int answer = 0;

        char[] chars = s.toCharArray();
        int duplex = 1;
        for (int i = chars.length - 1; i >= 0; i--) { // 1의 자리부터
            if (chars[i] == '+') {
                continue;
            } else if (chars[i] == '-') {
                answer *= -1;
            } else {
                answer += (chars[i] - 48) * duplex;
                duplex *= 10;
            }

            System.out.println("answer = " + answer);
        }

        return answer;
    }
}
