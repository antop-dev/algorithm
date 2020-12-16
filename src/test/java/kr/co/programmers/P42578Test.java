package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class P42578Test {
    private final P42578 p = new P42578();

    @Test
    public void 입출력예1() {
        assertEquals(5, p.solution(new String[][]
                {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}
        ));
    }

    @Test
    public void 입출력예2() {
        assertEquals(3, p.solution(new String[][]
                {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}
        ));
    }

    @Test
    public void 문제설명() {
        assertEquals(23, p.solution(new String[][]
                {{"동그란 안경", "얼굴"}, {"검정 선글라스", "얼굴"}, {"파란색 티셔츠", "상의"}, {"청바지", "하의"}, {"긴 코트", "겉옷"}}
        ));
    }
}
