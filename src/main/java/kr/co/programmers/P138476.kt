package kr.co.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://github.com/antop-dev/algorithm/issues/437
public class P138476 {
    public int solution(int k, int[] tangerine) {
        List<Entry<Integer, Long>> collect = Arrays.stream(tangerine)
                .boxed()
                // 사과 크기 : 사과 개수 집계
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                // 사과 개수로 내림차순 정렬
                .sorted((o1, o2) -> (int) (o2.getValue() - o1.getValue()))
                .collect(Collectors.toList());
        // [0] = 사과 종류 개수
        // [1] = 사과 총 개수
        int[] accumulate = new int[]{0, 0};
        for (Entry<Integer, Long> e : collect) {
            accumulate[0]++;
            accumulate[1] += e.getValue();
            if (accumulate[1] >= k) {
                break;
            }
        }
        return accumulate[0];
    }
}
