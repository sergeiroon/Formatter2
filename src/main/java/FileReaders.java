import java.io.*;

/**
 * Reader implements IReader
 */
class FileReaders implements IReader {
    private FileReader stream;

    /**
     *
     * @param filename путь к файлу
     * @throws FileNotFoundException если файл не найден
     */
     FileReaders(final String filename) throws FileNotFoundException {
            stream = new FileReader(filename);
    }

    /**
     *
     * @return есть символ еще в файле или нет
     * @throws IOException исключение ввода вывода
     */
    public boolean hasChars() throws IOException {
        return stream.ready();
    }

    /**
     *
     * @return слдующий символ из файла
     * @throws IOException исключение ввода вывода
     */
    public char readChar() throws IOException {


        return (char) stream.read();
    }
}