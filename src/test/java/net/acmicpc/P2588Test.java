package net.acmicpc;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class P2588Test {

    @Test
    public void 예제1() throws Exception {
        String input = "472" + System.lineSeparator() + "385";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true, "UTF-8"));

        P2588.main(new String[]{});

        assertEquals(
                "2360" + System.lineSeparator()
                        + "3776" + System.lineSeparator()
                        + "1416" + System.lineSeparator()
                        + "181720" + System.lineSeparator(),
                out.toString()
        );
    }
}