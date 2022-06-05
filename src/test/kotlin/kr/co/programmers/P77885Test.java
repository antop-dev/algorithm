package kr.co.programmers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class P77885Test {
    private final P77885 p = new P77885();

    @Test
    void example01() {
        assertThat(p.solution(new long[]{2, 7}), is(new long[]{3, 11}));
    }

    @Test
    void example02() {
        assertThat(
                p.solution(new long[]{1001, 337, 0, 1, 333, 673, 343, 221, 898, 997, 121, 1015, 665, 779, 891, 421, 222, 256, 512, 128, 100}),
                is(new long[]{1002, 338, 1, 2, 334, 674, 347, 222, 899, 998, 122, 1019, 666, 781, 893, 422, 223, 257, 513, 129, 101})
        );
    }

}
