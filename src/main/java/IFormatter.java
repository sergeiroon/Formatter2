import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Formatter interface
 */
public interface IFormatter {
String format(IReader in,IWriter out) throws IOException;
}
