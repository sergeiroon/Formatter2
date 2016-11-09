import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;


/**
 * Test for Formatter
 */
public class FormatterTest {
    private IFormatter formatter;


    @Before
    public void setUp() {
        formatter = new Formatter();
    }

    @Test
    public void format1() throws IOException, FormatterException {
        IReader in = new StringReader("abc{abc");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc{\n    abc", out.toString());
    }
    @Test
    public void format2() throws IOException, FormatterException {
        IReader in = new StringReader("abc}abc");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc\n}\nabc", out.toString());
    }
    @Test
    public void format() throws IOException, FormatterException {
        IReader in = new StringReader("abc;abc");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc;\nabc", out.toString());
    }
    @Test
    public void format4() throws IOException, FormatterException {
        IReader in = new StringReader("abc//abc\n");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc//abc\n\n", out.toString());
    }
    @Test
    public void format5() throws IOException, FormatterException {
        IReader in = new StringReader("abc/*abc*/");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc/*abc*/\n", out.toString());
    }
    @Test
    public void format6 () throws IOException, FormatterException {
        IReader in = new StringReader("abc=\'abc{abc}\'");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc='abc{abc}'", out.toString());
    }
    @Test
    public void format7 () throws IOException, FormatterException {
        IReader in = new StringReader("abc=\"abc{abc}\"");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc=\"abc{abc}\"", out.toString());
    }
    @Test
    public void format8 () throws IOException, FormatterException {
        IReader in = new StringReader("abc");
        IWriter out = new StringWriter();
        formatter.format(in, out);
        assertEquals("abc", out.toString());
    }
}
