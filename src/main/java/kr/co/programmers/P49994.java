package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/327
public class P49994 {
    private static final int BLOCK = 11;

    public int solution(String dirs) {
        var memo = new boolean[119][119];
        var from = (5 * BLOCK) + 5;
        var ans = 0;
        for (var dir : dirs.toCharArray()) {
            var to = from;
            // 범위가 넘치치 않으면 이동
            if (dir == 'U' && to >= BLOCK) {
                to -= BLOCK;
            } else if (dir == 'R' && (to % BLOCK) + 1 < BLOCK) {
                to++;
            } else if (dir == 'D' && (to / BLOCK) + 1 < BLOCK) {
                to += BLOCK;
            } else if (dir == 'L' && (to % BLOCK) - 1 >= 0) {
                to--;
            }
            // 지나간 적이 없는 길이라면 카운트 업
            if (from != to && !memo[from][to]) {
                ans++;
                // 지나감 기록
                memo[from][to] = true;
                memo[to][from] = true;
            }

            from = to;
        }
        return ans;
    }

}
