package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

// https://github.com/antop-dev/algorithm/issues/423
public class P423 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // 숫자 -> 출현 횟수 구조로 변경
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.putIfAbsent(n, 0);
            map.computeIfPresent(n, (key, v) -> v + 1);
        }
        // 출현 횟수를 오름차순으로 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        // 출현 횟수가 낮은 숫자부터 arr에 재할당
        int i = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            for (int j = 0; j < e.getValue(); j++) {
                arr[i++] = e.getKey();
            }
        }
        // k 이후의 정복되지 않는 숫자 횟수 카운팅
        int prev = -1;
        int count = 0;
        while (k < arr.length) {
            if (prev != arr[k]) {
                count++;
                prev = arr[k];
            }
            k++;
        }
        return count;
    }
}
