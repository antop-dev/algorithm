package kr.co.programmers;

import org.junit.Before;
import org.junit.Test;

public class P42883Test {
    private P42883 solution;

    @Before
    public void setUp() {
        solution = new P42883();
    }

    @Test
    public void solution1() {
        String solution = this.solution.solution("1924", 2);
        System.out.println();
        System.out.println("1924 → " + solution);
    }

    @Test
    public void solution2() {
        String solution = this.solution.solution("1231234", 3);
        System.out.println();
        System.out.println("1231234 → " + solution);
    }

    @Test
    public void solution3() {
        String solution = this.solution.solution("4177252841", 4);
        System.out.println();
        System.out.println("4177252841 → " + solution);
    }

    @Test
    public void solution4() {
        // 아래와 같이 처음 한 싸이클만 돌려도 결과가 나오는 경우 이 후 루프를 수행하지 않게 하면 좋을 듯!
        // 하지만 코드가 좀 더 들어가.... ㅠㅠ
        String solution = this.solution.solution("4177952841", 4);
        System.out.println();
        System.out.println("4177952841 → " + solution);
    }

    @Test
    public void solution5() {
        String solution = this.solution.solution("4177952841", 4);
        System.out.println();
        System.out.println("4177952841 → " + solution);
    }

}