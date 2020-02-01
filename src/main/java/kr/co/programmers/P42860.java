package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42860
 */
public class P42860 {
    public int solution(String name) {
        // 위아래 필요한 조작 횟수만 구해 놓는다.
        int[] diff = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            diff[i] = Math.min(c - 'A', 'Z' - c + 1);
        }

        int answer = 0; // 총 조작 횟수
        int loop = 0; // 반복 횟수

        for (int x : diff) {
            answer += x; // 위아래 조작 횟수는 미리 더한다.
            if (x > 0) {
                loop++;
            }
        }

        int p = 0; // 현재 위치 (배열의 인덱스)
        for (int i = 0; i < loop; i++) {
            diff[p] = 0; // 방문(?) 체크

            for (int m = 1; m <= diff.length; m++) {
                int r = (p + m) % diff.length;
                int l = (p - m + diff.length) % diff.length;

                if (diff[r] > 0 || diff[l] > 0) {
                    p = diff[r] > 0 ? r : l;
                    answer += m;
                    break;
                }
            }
        }
        return answer;
    }

}
