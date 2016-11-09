import java.io.IOException;

/**
 * Formatter interface
 */
interface IFormatter {
    /**
     *
     * @param in входной поток
     * @param out выходной поток
     * @throws FormatterException форматирования
     */
    void format(IReader in, IWriter out) throws FormatterException;
}
