public class LogCalculableFactory implements iCalculableFactory{

    private iLoggable logger;

    public LogCalculableFactory(iLoggable logger){
        this.logger = logger;
    }
    @Override
    public iCalculable create(double a, double b) {
        return new LogCalculator(new Calculator(a,b), logger);
    }
}
