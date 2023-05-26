// Создание класса LogCalculator и подключение интерфейса iCalculable
public class LogCalculator implements iCalculable{

    private iCalculable decorated;
    private iLoggable logger;
// Конструктор класса LogCalculator 
    public LogCalculator(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }
// Метод для вычисления суммы комплексных чисел с логированием
    @Override
    public iCalculable sum(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %f + %f i. Начало вызова метода sum с параметром %f", a, b, c));
        iCalculable result = decorated.sum(c);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }
// Метод для вычисления произведения комплексных чисел с логированием
    @Override
    public iCalculable multi(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %f + %f i. Начало вызова метода multi с параметром %f", a, b, c));
        iCalculable result = decorated.multi(c);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }
// Метод для вычисления частного комплексных чисел с логированием
    @Override
    public iCalculable division(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %f + %f i. Начало вызова метода division с параметром %f", a, b, c));
        iCalculable result = decorated.division(c);
        logger.log(String.format("Вызов метода division произошел"));
        return result;
    }
// Метод для вызова действительной части комплексного числа
    @Override
    public double getA() {
    return decorated.getA();
    }
// Метод для вызова мнимой части комплексного числа
    @Override
    public double getB() {
        return decorated.getB();
    }

// Метод для вызова результата вычисления с логированием
    public iCalculable getResult() {
        double result1 = decorated.getA();
        double result2 = decorated.getB();
        logger.log(String.format("Получение результата %f + %f i", result1, result2));
        return decorated;
    }

}
