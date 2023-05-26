public class ConsoleLogger implements iLoggable{

    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}