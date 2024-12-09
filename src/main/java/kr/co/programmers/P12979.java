package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/606
public class P12979 {
    public int solution(int n, int[] stations, int w) {
        int s = -w;
        int e = n + w + 1;

        int ans = 0;
        ans += calc(s, stations[0], w); // A
        for (int i = 1; i < stations.length; i++) { // B
            ans += calc(stations[i - 1], stations[i], w);
        }
        ans += calc(stations[stations.length - 1], e, w); // C

        return ans;
    }

    private int calc(int from, int to, int w) {
        int diff = (to - w - 1) - (from + w + 1) + 1;
        int v = diff / (w + 1 + w);
        if (diff % (w + 1 + w) > 0) {
            v++;
        }
        return v;
    }
}
