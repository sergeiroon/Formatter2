import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * test for StrinReader
 */
public class StringReaderTest {
    private IReader readerString;
    @Before
    public void setUp() throws FileNotFoundException {

        readerString = new StringReader("abc");
    }

    @Test
    public void hasChar2() throws IOException {
        assertTrue(readerString.hasChars());
    }

    @Test
    public void readChar2() throws IOException {
        assertEquals(97,readerString.readChar());
    }
}


