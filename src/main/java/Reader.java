import java.io.*;

/**
 * Reader impements IReader
 */
public class Reader implements IReader {
    private BufferedReader stream;
    String way;

    public Reader(String filename) throws FileNotFoundException {
            stream = new BufferedReader(new FileReader(filename));
    }

public String readCharline() throws IOException {

    return stream.readLine();
}

    public char charReader() throws IOException {

        return (char) stream.read();
    }
}