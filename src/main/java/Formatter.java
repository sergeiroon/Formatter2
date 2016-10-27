import java.io.*;

/**
 * Класс Formatter предназначен для форматирования текста
 */
public final class Formatter {
   private Formatter(){
    }

    /**
     *метод formater получает путь к файлу и форматирует его содержимое
     * @param way путь к файлу
     * @throws IOException
     */
    public static void formatter(final String way) throws IOException {
        File file = new File(way);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int indent = 0;
        String line;
        String newString = "";
        String space = "";
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            char[] buffer = new char[line.length()];
            buffer = line.toCharArray();
            for (int i = 0; i < buffer.length; i++) {

                if (!(buffer[i] == '{' | buffer[i] == '}' | buffer[i] == ';' | buffer[i] == buffer.length - 1)) {
                    newString = newString + buffer[i];
                } else {
                    if (buffer[i] == '{') {
                        indent = indent + 4;
                        space = "";
                        for (int a = indent; a > 0; a--) {
                            space = space + " ";
                        }
                        newString = newString + buffer[i] + "\r\n" + space;
                    }
                    if (buffer[i] == '}') {
                        indent = indent - 4;
                        space = "";
                        for (int a = indent; a > 0; a--) {
                            space = space + " ";
                        }
                        newString = newString + "\r\n" + space + buffer[i] + "\r\n" + space;
                    }
                    if (buffer[i] == ';') {
                        newString = newString + buffer[i] + "\r\n" + space;
                    }
                }
            }

        }
        System.out.print(newString);
        FileWriter wreiter = new FileWriter(file);
        wreiter.write(newString);
        wreiter.close();




    }
}

