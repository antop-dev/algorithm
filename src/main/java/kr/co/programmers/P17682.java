package kr.co.programmers;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class P17682 {
    public int solution(String dartResult) {
        Pattern pattern = Pattern.compile("([0-9]{1,2})([S|D|T]{1})([\\*|\\#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        int[] scores = new int[matcher.groupCount()];
        int pos = 0;

        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);

            int v = (int) Math.pow(score, bonus.equals("S") ? 1 : bonus.equals("D") ? 2 : 3);
            if (option.equals("*")) { // 앞의 점수와 내 점수 x 2
                v *= 2;
                if (pos > 0) {
                    scores[pos - 1] *= 2;
                }
            } else if (option.equals("#")) { // -로 바꿈
                v *= -1;
            }

            scores[pos++] = v;

            System.out.println(String.format("%-3s → %s", matcher.group(0), Arrays.toString(scores)));
        }

        // 합계
        int answer = 0;
        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
