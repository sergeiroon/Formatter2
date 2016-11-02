import java.io.IOException;

/**
 * Writer interface
 */
public interface IWriter {
   boolean writeChars(String newString) throws IOException;
    void close() throws IOException;
}
