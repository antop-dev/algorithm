package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class P17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 1차원 배열로 처리한다!
        int[] box = new int[n * n];
        // 지도1 마킹
        marking(box, arr1, n);

        // 출력용
        for (int i = 0; i < box.length; i++) {
            if (i > 0 && i % n == 0) {
                System.out.println();
            }
            System.out.print(box[i]);
        }

        // 지도2 마킹
        marking(box, arr2, n);

        // 출력용
        System.out.println();
        System.out.println();
        for (int i = 0; i < box.length; i++) {
            if (i > 0 && i % n == 0) {
                System.out.println();
            }
            System.out.print(box[i]);
        }

        // # 문자로 만듬
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += box[(i * n) + j] == 1 ? "#" : " ";
            }
            answer[i] = s;
        }

        // 출력용
        System.out.println();
        System.out.println();
        for (String s : answer) {
            System.out.println(s);
        }

        return answer;
    }

    /**
     * map, n 으로 box에 마킹한다.<br/>
     * 이 때 겹치는 마킹을 처리한다.
     *
     * @param box 최종 마킹될 배열
     * @param map 지도
     * @param n 한 변의 기리
     */
    private void marking(int[] box, int[] map, int n) {
        for (int i = 0; i < map.length; i++) {
            int v = map[i];
            int idx = n * (i + 1) - 1;
            while (v > 1) {
                box[idx] |= v % 2;
                v = v / 2;
                idx--;
            }
            box[idx] |= v;
        }
    }
}
