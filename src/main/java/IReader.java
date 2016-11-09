import java.io.IOException;

/**
 * Reader interface
 */
interface IReader {
    /**
     *
     * @return возвращает символ
     * @throws IOException исключение ввода вывода
     */
   char readChar() throws IOException;

    /**
     *
     * @return есть ли символ
     * @throws IOException исключение ввода вывода
     */
    boolean hasChars() throws IOException;
}
