import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Test for Formatter
 */
public class FormatterTest {
    private IFormatter formatter;
    String newString = "abc{abc}";

    @Before
    public void setUp() {
        formatter = new Formatter();
    }

    @Test
    public void readCharline() throws IOException {
        String str = new Reader("txt.txt").readCharline();
        assertEquals("123{123}", str);
    }

    @Test
    public void charReader() throws IOException {
        char str = new Reader("txt.txt").charReader();
        char a = '1';
        assertEquals(a, str);
    }
    @Test
    public void writeChars() throws IOException {
        IWriter writer = new Writer("txt3.txt");
        assertTrue(writer.writeChars(newString));
        writer.close();


    }
    @Test
    public void format() throws IOException {
        Reader in = new Reader("txt.txt");
        Writer out = new Writer("txt1.txt");
        assertEquals("123{\r\n    123\r\n}\r\n", formatter.format(in, out));
    }
}
