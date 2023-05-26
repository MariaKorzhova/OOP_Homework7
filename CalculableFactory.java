

public class CalculableFactory implements iCalculableFactory {
    public Calculator create(double a, double b) {
        return new Calculator(a, b);
    }
}
