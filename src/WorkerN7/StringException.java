package WorkerN7;

// Создание пользовательского исключения StringException
public class StringException extends Exception {
    public StringException(String message) {
        // Вызов конструктора суперкласса Exception с сообщением об ошибке
        super(message);
    }
}
