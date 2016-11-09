import java.io.IOException;

/**
 * StringReader implements IReader
 */
class StringReader implements IReader {
    private String str;

    /**
     *
     * @param s строка для чтения
     */
    StringReader(final String s) {
        str = s;

    }
    private int count = 0;

    /**
     *
     * @return символ со строки
     * @throws IOException ошибка ввода вывода
     */
    public char readChar() throws IOException {
        char c = str.charAt(count);
        count++;
        return c;
    }

    /**
     *
     * @return есть символ в строке или нет
     * @throws IOException ошибка ввода вывода
     */
    public boolean hasChars() throws IOException {
        return count < str.length();
    }
}
