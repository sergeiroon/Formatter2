import java.io.IOException;

/**
 * Writer interface
 */
interface IWriter {
    /**
     *
     * @param c записывающийся символ
     * @throws IOException исключение ввода вывода
     */
    void writeChar(char c) throws IOException;

    /**
     *
     * @throws IOException исключение ввода вывода
     */
    void close() throws IOException;
}
