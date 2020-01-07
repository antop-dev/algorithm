package kr.co.programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class P42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        // map[선수 이름] = 선수의 수
        for (String s : participant) {
            int c = map.getOrDefault(s, 0) + 1;
            map.put(s, c);
        }
        // before
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        // 완주한 선수의 이름으로 카운트 -1
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        // after
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        // 완주하지 못한 참가자를 찾아서 리턴
        return map.entrySet().stream().filter(e -> e.getValue() > 0).findFirst().map(Map.Entry::getKey).orElse("");
    }

}
