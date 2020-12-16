package kr.co.programmers;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class P12969Test {

    @Test
    public void 예시() throws IOException {
        InputStream input = new ByteArrayInputStream("5 3".getBytes());
        System.setIn(input);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(baos, true, "UTF-8");
        System.setOut(output);

        P12969.main(new String[]{});

        assertEquals(
                "*****" + System.lineSeparator() +
                        "*****" + System.lineSeparator() +
                        "*****" + System.lineSeparator(),
                baos.toString()
        );

    }
}
