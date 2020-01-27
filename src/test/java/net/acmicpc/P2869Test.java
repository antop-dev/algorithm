package net.acmicpc;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * https://www.acmicpc.net/problem/2869
 */
public class P2869Test {

    @Test
    public void 예제1() throws Exception {
        String input = "2 1 5";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P2869.main(new String[]{});

        assertEquals("4" + System.lineSeparator(), out.toString());
    }

    @Test
    public void 예제2() throws Exception { // https://www.acmicpc.net/board/view/40766
        String input = "249 125 500";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P2869.main(new String[]{});

        assertEquals("4" + System.lineSeparator(), out.toString());
    }

}