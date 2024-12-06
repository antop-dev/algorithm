package kr.co.programmers;

import java.util.HashMap;
import java.util.Map;

// https://github.com/antop-dev/algorithm/issues/605
public class P1835 {
    public int solution(int n, String[] data) {
        var memo = new HashMap<Character, Integer>();
        var friends = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        var visited = new boolean[friends.length];
        return dfs(memo, data, friends, visited, -1);
    }

    private int dfs(Map<Character, Integer> memo, String[] data, char[] friends, boolean[] visited, int pos) {
        if (memo.size() == 8) { // 모두 줄 섯을 때 조건에 맞게 섯는지 비교
            return checkPosition(memo, data) ? 1 : 0;
        }
        int sum = 0;
        for (int i = 0; i < friends.length; i++) {
            if (!visited[i]) { // 아직 서지 않은 프랜즈만 세운다.
                visited[i] = true;
                memo.put(friends[i], pos + 1);
                sum += dfs(memo, data, friends, visited, pos + 1);
                // backtracking
                visited[i] = false;
                memo.remove(friends[i]);

            }
        }
        return sum;
    }

    private boolean checkPosition(Map<Character, Integer> memo, String[] data) {
        for (String s : data) {
            int x = memo.get(s.charAt(0));
            int y = memo.get(s.charAt(2));
            int diff = Math.abs(x - y) - 1;
            char op = s.charAt(3);
            int v = s.charAt(4) - '0';
            if ((op == '=' && diff != v)
                    || (op == '<' && diff >= v)
                    || (op == '>' && diff <= v)
            ) {
                return false;
            }
        }
        return true;
    }
}
