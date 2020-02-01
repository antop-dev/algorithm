package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 */
public class P12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0}; // 탈락자 없는 상태
        int i = 1;

        label:
        while (i < words.length) {
            String b = words[i - 1]; // 전 단어
            String c = words[i]; // 현재 단어

            System.out.println(String.format("%2d 번째 : %s → %s", i + 1, b, c));

            // 바로 전 단어의 끝 단어와 다를 경우
            if (b.charAt(b.length() - 1) != c.charAt(0)) {
                break label;
            } else {
                // 앞에서 나온 단어를 사용했을 경우
                for (int j = 0; j < i; j++) {
                    if (words[j].equals(c)) {
                        break label;
                    }
                }
            }

            i++;
        }

        if (i < words.length) {
            answer[0] = (i % n) + 1; // 탈락하는 사람의 번호
            i += 1;
            answer[1] = (i / n) + (i % n > 0 ? 1 : 0); // 몇 번째 차례
        }

        return answer;
    }
}
