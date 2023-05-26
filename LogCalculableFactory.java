// Создание класса LogCalculableFactory и подключение интерфейса iCalculableFactory
public class LogCalculableFactory implements iCalculableFactory{

    private iLoggable logger;
// Конструктор класса LogCalculableFactory
    public LogCalculableFactory(iLoggable logger){
        this.logger = logger;
    }
// Метод для создания LogCalculator (калькулятора с логированием)
    @Override
    public iCalculable create(double a, double b) {
        return new LogCalculator(new Calculator(a,b), logger);
    }
}
