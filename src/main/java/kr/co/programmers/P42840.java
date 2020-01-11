package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class P42840 {
    public int[] solution(int[] answers) {
        int[][] persons = new int[][]{
                {1, 2, 3, 4, 5}, // 1번 수포자의 찍는 방식
                {2, 1, 2, 3, 2, 4, 2, 5}, // 2번 수포자의 찍는 방식
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} // 3번 수포자의 찍는 방식
        };

        int[] x = new int[]{0, 0, 0}; // 수포자들의 맞춘 점수
        int[] y = new int[]{1, 2, 3}; // 수포자들의 번호
        int[] z = new int[]{0, 0, 0}; // 수포자들의 찍는 번호 포인터

        // 정답과 수포자들의 찍는 패턴을 돌면서 답을 맞춘다.
        for (int i = 0; i < answers.length; i++) {
            System.out.println();
            for (int j = 0; j < x.length; j++) {
                // FIXME: % 연산을 하면 z 변수가 필요 없다.
                if (z[j] >= persons[j].length) { // 찍는 패턴의 마지막이 넘어가면 다시 처음으로 이동
                    z[j] = 0;
                }
                System.out.println("answers[" + i + "] (" + answers[i] + ")"
                        + " == persons[" + j + "][z[" + j + "]] (" + persons[j][z[j]] + ")"
                        + " ? " + (answers[i] == persons[j][z[j]]));
                if (answers[i] == persons[j][z[j]]) { // 답을 맞춤
                    x[j]++;
                }
                z[j]++; // 포인터 이동
            }
        }

        System.out.println();
        System.out.println("x = " + Arrays.toString(x));
        System.out.println("y = " + Arrays.toString(y));
        System.out.println("z = " + Arrays.toString(z));


        // 수포자는 3명으로 고정되어 잇다.
        // 굳이 배열을 돌려가면서 처리할 필요가 있을까?
        // 3명을 비교로 처리하면 y 변수와 정렬이 필요 없을 것 같다.

        // x를 정렬하면서 y도 같이 정렬한다.
        sort(x, y);

        // 최고점을 찾는다.
        int max = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        // 최고점의 수포자 수를 계산한다. (최대 3)
        int maxCount = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == max) {
                maxCount++;
            }
        }

        // 최고점의 수포자들만 골라서 배열로 리턴
        int idx = 0;
        int[] answer = new int[maxCount];
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == max) {
                answer[idx] = y[i];
                idx++;
            }
        }

        return answer;
    }

    private void sort(int[] data, int[] refs) {
        sort(data, 0, data.length - 1, refs);
    }

    private void sort(int[] data, int l, int r, int[] refs) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {
            while (data[left] < pivot) left++;
            while (data[right] > pivot) right--;
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;

                int t = refs[left];
                refs[left] = refs[right];
                refs[right] = t;

                left++;
                right--;
            }
        } while (left <= right);

        if (l < right) sort(data, l, right, refs);
        if (r > left) sort(data, left, r, refs);
    }
}
