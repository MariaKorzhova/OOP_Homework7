public class LogCalculator implements iCalculable{

    private iCalculable decorated;
    private iLoggable logger;

    public LogCalculator(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable division(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода division с параметром %d", firstArg, arg));
        iCalculable result = decorated.division(arg);
        logger.log(String.format("Вызов метода division произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

}
