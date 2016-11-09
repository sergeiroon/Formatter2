import java.io.IOException;

/**
 * StringWriter implements IWriter
 */
class StringWriter implements IWriter {
    private String str = "";

    /**
     *
     * @param c записывающийся символ
     * @throws IOException ошибка ввода вывода
     */
    public void writeChar(final char c) throws IOException {
        str = str + c;
    }

    /**
     *
     * @throws IOException ошибка ввода вывода
     */
    public void close() throws IOException {
        System.out.println(str);
    }

    /**
     *
     * @return отформатированную строку
     */
    public String toString() {
        return str;
    }
}
