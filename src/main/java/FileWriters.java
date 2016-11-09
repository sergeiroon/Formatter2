import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer implements IWriter
 */
class FileWriters implements  IWriter {
    private FileWriter wreiter;

    /**
     *
     * @param way путь к файлу
     * @throws IOException исключение ввода вывода
     */
    FileWriters(final String way) throws IOException {
    wreiter = new FileWriter(way);
    }

    /**
     *
     * @param c символ записывающийся в файл
     * @throws IOException исключение ввода вывода
     */
    public void writeChar(final char c) throws IOException {
        wreiter.write(c);
    }

    /**
     *
     * @throws IOException исключение ввода вывода
     */
    public void close() throws IOException {
        wreiter.close();

    }
}
