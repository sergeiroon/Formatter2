import java.io.IOException;

/**
 * класс для проверки formatter
 */
public class Main {
    /**
     * конструктор
     */
    Main(){
    }

    /**
     *
     * @param args аргумент командной строки
     * @throws FormatterException исключение formatter
     */
    public static void main (final String [] args) throws FormatterException {
        new Formatter().format(new StringReader("abc{abc"), new StringWriter());
    }
}
