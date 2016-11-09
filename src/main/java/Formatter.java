import java.io.*;

/**
 * Класс Formatter предназначен для форматирования текста
 */
 class Formatter implements IFormatter {
    /**
     * Создает объект класса Formatter
     */
     Formatter() {
    }

    /**
     * метод format получает путь к файлу и форматирует его содержимое
     *
     * @param in  входные данные
     * @param out выходные данные
     * @throws FormatterException исключение
     */
    public void format(final IReader in, final IWriter out) throws FormatterException {
        try {

            int indent = 0;
            final int indentspace = 4;
            char c;
            while (in.hasChars()) {
                c = in.readChar();
                if (c == '{') {
                    indent = indent + indentspace;
                    out.writeChar(c);
                    out.writeChar('\n');
                    for (int i = 0; i < indent; i++) {
                        out.writeChar(' ');
                    }

                }
                if (c == '}') {
                    indent = indent - indentspace;
                    out.writeChar('\n');
                    for (int i = 0; i < indent; i++) {
                        out.writeChar(' ');
                    }
                    out.writeChar(c);
                    out.writeChar('\n');

                }
                if (c == ';') {
                    out.writeChar(c);
                    for (int i = 0; i < indent; i++) {
                        out.writeChar(' ');
                    }
                    out.writeChar('\n');

                }
                if (c == '/') {
                    out.writeChar(c);
                    c = in.readChar();
                    if (c == '/') {
                        out.writeChar(c);
                        while ((c = in.readChar()) != '\n') {
                            out.writeChar(c);
                        }
                        out.writeChar(c);
                    }
                    if (c == '*') {
                        out.writeChar(c);
                        while ((c = in.readChar()) != '*') {
                            out.writeChar(c);
                        }
                        out.writeChar(c);
                        out.writeChar(in.readChar());
                        out.writeChar('\n');
                    }


                }
                if (c == '\'') {
                    out.writeChar(c);
                    while ((c = in.readChar()) != '\'') {
                        out.writeChar(c);
                    }
                    out.writeChar(c);
                }
                if (c == '\"') {
                    out.writeChar(c);
                    while ((c = in.readChar()) != '\"') {
                        out.writeChar(c);
                    }
                    out.writeChar(c);
                }

                if (c != '}' & c != '{' & c != ';' & c != '*' & c != '\'' & c != '\"') {
                    out.writeChar(c);
                }
            }

            out.close();
        } catch (IOException e) {
            throw new FormatterException(e);
        }
        }

}


