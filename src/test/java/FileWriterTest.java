import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * test for FileWriter
 */
public class FileWriterTest {
    private IWriter writeFile;
    private IReader readerFile;
    private IReader readerFile2;


    @Before
    public void setUp() throws IOException {
        readerFile = new FileReaders("txt.txt");
        writeFile = new FileWriters("txt1.txt");
        readerFile2 = new FileReaders("txt1.txt");
    }

    @Test
    public void hasChar1() throws IOException {
        writeFile.writeChar(readerFile.readChar());
        assertEquals('a',readerFile2.readChar());

    }
}