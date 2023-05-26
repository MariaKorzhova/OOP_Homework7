public class LogCalculableFactory implements iCalculableFactory{

    private iLoggable logger;

    public LogCalculableFactory(iLoggable logger){
        this.logger = logger;
    }
    @Override
    public iCalculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
