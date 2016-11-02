import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer implements IWriter
 */
public class Writer implements  IWriter{
    FileWriter wreiter;
    public Writer( String way) throws IOException {
wreiter = new FileWriter(way);
    }

    public boolean writeChars(String newString) throws IOException {
        wreiter.write(newString);
        return true;
    }

    public void close() throws IOException {
        wreiter.close();

    }
}
