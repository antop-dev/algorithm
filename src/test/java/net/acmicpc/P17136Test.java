package net.acmicpc;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://www.acmicpc.net/problem/17136
 */
public class P17136Test {
    private final String nl = System.lineSeparator();

    private String run(String input) throws Exception {
        PrintStream originalOutput = System.out;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));
        // run
        P17136.main(new String[]{});

        System.setOut(originalOutput);

        // print
        String result = out.toString();
        Arrays.stream(result.split(System.lineSeparator())).forEach(System.out::println);
        // return last line
        BufferedReader br = new BufferedReader(new StringReader(out.toString()));
        return br.lines().reduce((b, c) -> c).orElse("");
    }

    @Test
    public void 예제1() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("0", result);
    }

    @Test
    public void 예제2() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 1 0 0 0 0 0" + nl +
                "0 0 0 0 0 1 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("4", result);
    }

    @Test
    public void 예제3() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 1 0 0 0 0 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 1 1 0 0 0 0" + nl +
                "0 0 0 0 1 1 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("5", result);
    }

    @Test
    public void 예제4() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 1 0 0 0 0 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 1 1 0 0 0 0" + nl +
                "0 0 0 0 0 1 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("-1", result);
    }

    @Test
    public void 예제5() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 1 0 0 0 0 0 0 0" + nl +
                "0 1 1 1 0 0 0 0 0 0" + nl +
                "0 0 1 1 1 1 1 0 0 0" + nl +
                "0 0 0 1 1 1 1 0 0 0" + nl +
                "0 0 0 0 1 1 1 0 0 0" + nl +
                "0 0 1 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("7", result);
    }

    @Test
    public void 예제6() throws Exception {
        String input = "" +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl +
                "1 1 1 1 1 1 1 1 1 1" + nl;

        String result = run(input);
        assertEquals("4", result);
    }

    @Test
    public void 예제7() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 1 1 1 1 0 0 0 0" + nl +
                "0 1 1 1 1 1 0 0 0 0" + nl +
                "0 0 1 1 1 1 0 0 0 0" + nl +
                "0 0 1 1 1 1 0 0 0 0" + nl +
                "0 1 1 1 1 1 1 1 1 1" + nl +
                "0 1 1 1 0 1 1 1 1 1" + nl +
                "0 1 1 1 0 1 1 1 1 1" + nl +
                "0 0 0 0 0 1 1 1 1 1" + nl +
                "0 0 0 0 0 1 1 1 1 1" + nl;

        String result = run(input);
        assertEquals("6", result);
    }

    @Test
    public void 예제8() throws Exception {
        String input = "" +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "1 1 1 1 1 0 0 0 0 0" + nl +
                "1 1 1 1 1 0 1 1 1 1" + nl +
                "1 1 1 1 1 0 1 1 1 1" + nl +
                "1 1 1 1 1 0 1 1 1 1" + nl +
                "1 1 1 1 1 0 1 1 1 1" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl +
                "0 1 1 1 0 1 1 0 0 0" + nl +
                "0 1 1 1 0 1 1 0 0 0" + nl +
                "0 1 1 1 0 0 0 0 0 1" + nl;

        String result = run(input);
        assertEquals("5", result);
    }

    @Test
    public void 반례1() throws Exception {
        String input = "" +
                "1 1 1 1 1 1 1 0 0 0" + nl +
                "1 1 1 1 1 1 1 0 0 0" + nl +
                "1 1 1 1 1 1 1 0 0 0" + nl +
                "1 1 1 1 1 1 1 0 0 0" + nl +
                "1 1 1 1 1 1 1 0 0 0" + nl +
                "1 1 1 1 1 0 0 0 0 0" + nl +
                "1 1 1 1 1 0 0 0 0 0" + nl +
                "1 1 1 1 1 0 0 0 0 0" + nl +
                "1 1 1 1 1 0 0 0 0 0" + nl +
                "0 0 0 0 0 0 0 0 0 0" + nl;

        String result = run(input);
        assertEquals("5", result);
    }

}
