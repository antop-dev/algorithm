package kr.co.programmers;

import java.util.LinkedList;

public class P17680 {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) { // 캐시의 크기가 0이면 바로 리턴
            return cities.length * 5;
        }

        LinkedList<String> cache = new LinkedList<>();

        int answer = 0; // 실행 시간
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            System.out.println();
            System.out.println("city = " + city);

            int idx = cache.indexOf(city);
            if (idx > -1) { // 캐시에서 찾았을 경우
                cache.remove(idx);
                answer += 1;
            } else { // 캐시에서 못 찾았을 경우
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                answer += 5;
            }

            cache.addLast(city);

            System.out.println("cache = " + cache);
            System.out.println("answer = " + answer);
        }

        return answer;
    }

}
