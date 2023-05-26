public class LogCalculator implements iCalculable{

    private iCalculable decorated;
    private iLoggable logger;

    public LogCalculator(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %d + %d i. Начало вызова метода sum с параметром %d", a, b, c));
        iCalculable result = decorated.sum(c);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %d + %d i. Начало вызова метода multi с параметром %d", a, b, c));
        iCalculable result = decorated.multi(c);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable division(Calculator c) {
        double a = decorated.getA();
        double b = decorated.getB();
        logger.log(String.format("Первое значение калькулятора %d+ %d i. Начало вызова метода division с параметром %d", a, b, c));
        iCalculable result = decorated.division(c);
        logger.log(String.format("Вызов метода division произошел"));
        return result;
    }

    @Override
    public double getA() {
    return decorated.getA();
    }

    @Override
    public double getB() {
        return decorated.getB();
    }

    // @Override
    public iCalculable getResult() {
        double result1 = decorated.getA();
        double result2 = decorated.getB();
        logger.log(String.format("Получение результата %d + %d i", result1, result2));
        return decorated;
    }

}
