
/**
 * FormatterException
 * 				when formatting failed
 *
 */
class FormatterException extends Exception {
    /**Создает объект исключения со значениям
     * @param message сообщение об ошибке
     *
     */
     FormatterException(final String message) {
        super(message);
    }
    /**Создает объект исключения
     * @param e объект исключения
     */
     FormatterException(final Exception e) {
    super("formatting failed");
}
}
