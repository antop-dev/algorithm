package net.acmicpc;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://www.acmicpc.net/problem/1463
 */
public class P1463Test {

    @Test
    public void 예제1() throws Exception {
        String input = "2";
        String output = "1";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P1463.main(new String[]{});

        assertEquals(output + System.lineSeparator(), out.toString());
    }

    @Test
    public void 예제2() throws Exception {
        String input = "10";
        String output = "3";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P1463.main(new String[]{});

        assertEquals(output + System.lineSeparator(), out.toString());
    }

    @Test
    public void 예제3() throws Exception {
        String input = "94";
        String output = "7";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P1463.main(new String[]{});

        assertEquals(output + System.lineSeparator(), out.toString());
    }

    @Test
    public void 예제4() throws Exception {
        String input = "30";
        String output = "4";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P1463.main(new String[]{});

        assertEquals(output + System.lineSeparator(), out.toString());
    }

    @Test
    public void 예제5() throws Exception {
        String input = "321";
        String output = "9";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P1463.main(new String[]{});

        assertEquals(output + System.lineSeparator(), out.toString());
    }
}
