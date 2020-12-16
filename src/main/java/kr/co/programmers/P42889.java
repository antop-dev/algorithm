package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class P42889 {
    /**
     * @param N      전체 스테이지 수
     * @param stages 사용자별 도달해있는 스테이 번호
     * @return
     */
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 총 스테이지 수
        int total = stages.length;
        // 실패율
        double[] pcts = new double[N];
        // 실패율 계산
        for (int n = 1; n <= N; n++) {
            int c = 0;
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] == n) {
                    c++;
                    stages[i] = 0;
                }
            }

            pcts[n - 1] = c == 0 ? 0 : (double) c / total;
            System.out.println("stage[" + n + "] = " + c + "/" + total + " = " + pcts[n - 1]);
            total -= c;
        }

        // 실패율이 큰 순서로 정렬하기
        for (int i = 0; i < pcts.length; i++) {
            // 실패율이 가장 높은 숫자의 스테이지 번호를 찾는다.
            // 같으면 앞의 것 사용
            double max = -1;
            int idx = -1;
            for (int k = 0; k < pcts.length; k++) {
                if (pcts[k] > max) {
                    max = pcts[k]; // 가장 큰 수
                    idx = k; // 가장 큰 실패율의 위치 (인덱스)
                }
            }
            answer[i] = idx + 1;
            pcts[idx] = -1; // 찾은 큰 실패율은 -1로 변경해 놓는다.
        }

        return answer;
    }
}
