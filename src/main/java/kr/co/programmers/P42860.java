package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42860
 */
public class P42860 {
    public int solution(String name) {
        System.out.println("name = " + name);
        // 위아래 필요한 조작 횟수만 구해 놓는다.
        int[] diff = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            diff[i] = Math.min(c - 'A', 'Z' - c + 1);
        }
        System.out.println("diff = " + Arrays.toString(diff));

        int answer = 0; // 총 조작 횟수
        int pos = 0; // 현재 위치 (배열의 인덱스)
        while (true) {
            System.out.println();
            System.out.println("pos = " + pos);

            if (diff[pos] > 0) {
                int x = diff[pos];
                answer += x;
                diff[pos] = 0;

                System.out.println("▲▼ " + x);
                System.out.println("diff = " + Arrays.toString(diff));
            }

            if (complete(diff)) {
                System.out.println();
                System.out.println("complete.");
                break;
            }

            // 왼쪽으로 이동 했을 때 [위치, 거리]
            int[] left = move(diff, pos, true);
            // 오른쪽으로 이동 했을 때 [위치, 거리]
            int[] right = move(diff, pos, false);

            System.out.println(String.format("diff[%d] ◀%d diff[%d] ▶%d diff[%d]", left[0], left[1], pos, right[1], right[0]));
            System.out.println("choice " + (left[1] < right[1] ? "◀" + left[1] : "▶" + right[1]));

            // 다음 위치
            pos = left[1] < right[1] ? left[0] : right[0];
            // 다음 위치까지 이동한 거리
            answer += Math.min(left[1], right[1]);
        }

        return answer;
    }

    /**
     * 왼쪽 또는 오른쪽으로 이동했을 때 비용을 계산한다.
     *
     * @param diff 전체 배열
     * @param pos  현재 위치
     * @param left 왼쪽으로 이동할지 여부
     * @return [위치, 이동 횟수]
     */
    private int[] move(int[] diff, int pos, boolean left) {
        int n = left ? -1 : 1;
        int c = 0;
        while (true) {
            pos = pos + n;
            if (pos == -1) { // 첫번째 칸에서 왼쪽으로 이동시 오른쪽 끝으로 이동
                pos = diff.length - 1;
            }
            if (pos == diff.length) { // 마지막 칸에서 오른쪽으로 이동 시 처음으로 이동
                pos = 0;
            }
            c++;
            if (diff[pos] > 0) {
                return new int[]{pos, c}; // [위치, 이동횟수] 리턴
            }
        }
    }

    /**
     * 모두 처리 되었는지 체크
     *
     * @param diff 배열
     * @return 완료 여부
     */
    private boolean complete(int[] diff) {
        for (int i : diff) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
