package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/longest-string-chain/
 */
public class P1048 {
    public int longestStrChain(String[] words) {
        // 길이로 정렬
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // 메모제이션
        int[] dp = new int[words.length];
        // 최대 체인 수
        int max = 1;

        for (int i = 0; i < words.length; i++) {
            int chain = 0; // [내 문자]의 [이전 문자]들 중 가장 큰 체인을 담는 변수
            for (int j = i - 1; j >= 0; j--) { // 뒤로 탐색
                // 문자열 길이 차이
                int diff = words[i].length() - words[j].length();
                if (diff == 1) {
                    if (isChain(words[j], words[i])) {
                        chain = Math.max(chain, dp[j]);
                    }
                } else if (diff > 1) { // 차이가 2이상 나면 그만 탐색
                    break;
                }
            }

            dp[i] = chain + 1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    /**
     * 왼쪽 단어와 오른쪽 단어가 체인인지 검증한다.<br>
     * 오른쪽 단어의 글자 하나씩 왼쪽
     *
     * @param left  오른쪽 단어보다 한글자 적은 왼쪽 단어 (현재 단어보다 왼쪽에 잇는 단어)
     * @param right 오른쪽 단어 (현재 단어)
     * @return 체인 여부
     */
    private boolean isChain(String left, String right) {
        char[] l = left.toCharArray();
        char[] r = right.toCharArray();
        int removeCount = 0;

        for (char c : r) {
            for (int i = 0; i < l.length; i++) {
                if (l[i] == c) {
                    l[i] = ' ';
                    removeCount++;
                    break;
                }
            }
        }
        return l.length == removeCount;
    }
}
