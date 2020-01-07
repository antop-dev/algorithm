package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 */
public class P12948 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        answer.append(phone_number.substring(phone_number.length() - 4));
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.insert(0, "*");
        }

        return answer.toString();
    }
}
