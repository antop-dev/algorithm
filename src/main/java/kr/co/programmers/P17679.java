package kr.co.programmers;

import java.util.ArrayList;
import java.util.List;

public class P17679 {
    /**
     * @param m     판의 높이
     * @param n     판의 폭
     * @param board 판의 배치 정보
     * @return 지워지는 블록의 갯수
     */
    public int solution(final int m, final int n, final String[] board) {
        int answer = 0;
        int[] arr = new int[m * n];
        // 2차원 배열 → 1차원 배열
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                arr[x + (n * y)] = board[y].charAt(x);
            }
        }

        print(arr, n);

        while (true) {
            // 2x2가 완성되는 시작 위치를 기억한다.
            // [0] [1] 2 3
            // [4] [5] 6 7
            // 위와 같이 2x2를 찾았다면 기억되는 위치는 [0]이다.
            List<Integer> memo = new ArrayList<>();
            for (int i = 0; i < arr.length - n; i++) {
                if (i % n == n - 1) { // 체크하지 않아야 할 인덱스
                    continue;
                }
                // 2x2 사각형의 [값]을 구한다.
                int[] r = new int[]{arr[i], arr[i + 1], arr[i + n], arr[i + n + 1]};
                // 4개의 숫자가 모두 같으면 위치를 기억
                if (r[0] != -1 // 마킹용 숫자 배제
                        && (r[0] == r[1] && r[0] == r[2] && r[0] == r[3])) {
                    memo.add(i);
                }
            }

            if (memo.isEmpty()) { // 2x2가 하나도 없으면 끝
                System.out.println();
                System.out.println("not found 2x2");
                break;
            }

            System.out.println();
            System.out.println("find 2x2 = " + memo);

            for (int i : memo) { // 기억했던 위치의 2x2 사각형의 값을 -1로 바꿔주면서 점수+1
                // 2x2 사각형의 [배열 인덱스]를 구한다.
                int[] r = new int[]{i, i + 1, i + n, i + n + 1};
                for (int j : r) {
                    // 여기서 겹치는 부분 배제
                    // 값이 -1이면 이미 처리된 블록이다.
                    if (arr[j] != -1) {
                        answer++;
                        arr[j] = -1;
                    }
                }
            }

            print(arr, n);

            // 블록을 아래로 떨어뜨린다.
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == -1) {
                    for (int j = i - n; j >= 0; j -= n) {
                        if (arr[j] != -1) {
                            arr[i] = arr[j];
                            arr[j] = -1;
                            break;
                        }
                    }
                }
            }

            System.out.println();
            System.out.println("blocks fall down...");
            print(arr, n);
        }

        return answer;
    }

    private void print(int[] arr, int n) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && i % n == 0) {
                System.out.println();
            }
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
