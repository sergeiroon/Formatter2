import java.io.IOException;

/**
 * Reader interface
 */
 public interface IReader {
   char charReader () throws IOException;
    String readCharline() throws IOException;
}
