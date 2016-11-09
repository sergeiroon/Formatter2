import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

/**
 * test StringWriter
 */
public class StringWriterTest {
    private IWriter writeString;
    private IReader readerString;


    @Before
    public void setUp() throws IOException {
        readerString = new StringReader("abc");
        writeString = new StringWriter();
    }

    @Test
    public void hasChar1() throws IOException {
        writeString.writeChar(readerString.readChar());
        assertEquals('a',writeString.toString());

    }
}
