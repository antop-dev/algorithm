package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/642
public class P250137 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        var hits = health;
        var prevTime = 0; // 이전 공격 시간
        for (int[] attack : attacks) {
            var time = attack[0];
            var damage = attack[1];
            // 전 시간과 현재 시간 사이에 회복량 계산
            hits += healing(bandage, prevTime, time);
            if (hits > health) {
                hits = health;
            }
            // 공격 받음
            hits -= damage;
            if (hits <= 0) { // 케릭터가 죽음
                return -1;
            }
            prevTime = time;
        }
        return hits;
    }

    private int healing(int[] bandage, int prevTime, int currentTime) {
        var diff = currentTime - prevTime - 1;
        // 연속 회복 + 추가 회복
        var heal1 = bandage[1] * diff;
        var heal2 = bandage[2] * (diff / bandage[0]);
        return heal1 + heal2;
    }
}
