package kr.co.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class P42578 {
    public int solution(String[][] clothes) {
        return Arrays
                .stream(clothes)
                // Map[옷 종류][List<옷 이름>] 으로 변환
                .reduce(new HashMap<String, List<String>>(), (map, cloth) -> {
                    List<String> list = map.getOrDefault(cloth[1], new ArrayList<>());
                    list.add(cloth[0]);
                    map.put(cloth[1], list);
                    return map;
                }, (x, y) -> x) // 3번째 인자는 병렬 스트림시 병합 용도 (사용 안함)
                .entrySet()
                .stream()
                // 옷 이름의 가지수로 경우의 수 계산
                .reduce(0, (sum, e) -> {
                    int size = e.getValue().size(); // 현재 옷종류의 옷 개수
                    sum += sum * size; // 이전 조합들에 현재 옷 경우의 수 추가
                    sum += size; // 현재 옷 하나만 입었을 경우의 수 더하기

                    System.out.println();
                    System.out.println(e.getKey() + " = " + e.getValue());
                    System.out.println("sum (누적) = " + sum);

                    return sum;
                }, Integer::sum); // 3번째 인자는 병렬 스트림시 병합 용도 (사용 안함)
    }
}
