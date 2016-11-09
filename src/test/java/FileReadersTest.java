import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * test for Reader
 */
public class FileReadersTest {
    private IReader readerFile;


    @Before
    public void setUp() throws FileNotFoundException {
        readerFile = new FileReaders("txt.txt");

    }
    @Test
    public void hasChar1() throws IOException {
        assertTrue(readerFile.hasChars());

    }

    @Test
    public void readChar1() throws IOException {
        assertEquals(65279,readerFile.readChar());
    }

}
