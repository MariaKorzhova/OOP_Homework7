// Создание класса ConsoleLogger и подключение интерфейса iLoggable
public class ConsoleLogger implements iLoggable{

// Метод для вызова сообщения LOG в консоли
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}