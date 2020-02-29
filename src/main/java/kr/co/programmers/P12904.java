package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12904
 */
public class P12904 {

    public int solution(String s) {
        int answer = 0;
        char[] array = s.toCharArray();

        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                int n = j - i + 1; // 문자열 길이
                if (n <= answer) {
                    // 길이가 펠린드롬보다 작거나 같으면
                    // 체크할 필요가 없다.
                    break;
                }
                // 펠린드롬의 길이를 구함
                int c = palindrome(array, i, j);
                if (c > answer) {
                    answer = c; // 교체
                }
                // 현재 문자열이 펠린드롬일 경우
                // 이 후의 문자열을 체크할 필요가 없다.
                if (n == c) {
                    break;
                }
            }
        }
        return answer;
    }

    /**
     * [모든 문자열이 펠린드롬]일 경우 문자열 수를 반환. 아닐 때는 -1
     *
     * @param a     문자열 배열
     * @param start 시작 인덱스
     * @param end   끝 인덱스
     * @return 펠린드롬 수
     */
    private int palindrome(char[] a, int start, int end) {
        int half = (end - start) / 2;
        for (int i = 0; i <= half; i++) {
            if (a[start + i] != a[end - i]) {
                return -1;
            }
        }
        return end - start + 1;
    }
}
