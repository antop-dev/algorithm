package kr.co.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

// https://github.com/antop-dev/algorithm/issues/595
public class P17684 {
    public int[] solution(String msg) {
        // 큐 사용
        var n = msg.length();
        var queue = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            queue.offer(msg.charAt(i));
        }
        // 1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
        var dict = new HashMap<String, Integer>();
        var seq = 1;
        for (var ch = 'A'; ch <= 'Z'; ch++) {
            dict.put(String.valueOf(ch), seq++);
        }
        // 압축 시작
        var lzw = new ArrayList<Integer>();
        var w = new StringBuilder();
        while (!queue.isEmpty()) {
            // 2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
            w.append(queue.poll());
            while (!queue.isEmpty()) {
                if (!dict.containsKey(w.toString() + queue.peek())) {
                    break;
                }
                w.append(queue.poll());
            }
            // 3. w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거한다.
            lzw.add(dict.get(w.toString()));
            // 4. 입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
            if (!queue.isEmpty()) {
                dict.put(w.toString() + queue.peek(), seq++);
            }
            w.setLength(0);
        }
        // list → array
        var ans = new int[lzw.size()];
        for (int i = 0; i < lzw.size(); i++) {
            ans[i] = lzw.get(i);
        }
        return ans;
    }
}
