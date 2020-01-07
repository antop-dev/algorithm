package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class P12901 {
    public String solution(int a, int b) {
        // 윤년은 2월이 29일까지 있다.
        int[] days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int x = 5; // 2016.01.01 = 금요일

        // 월을 더한다.
        for (int m = 0; m < a - 1; m++) {
            x += days[m];
        }

        // 일을 더한 후 -1일 (1월 1일에 날을 더했으므로...)
        x += b - 1;

        return weeks[x % 7];
    }
}
