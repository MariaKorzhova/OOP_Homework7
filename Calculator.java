
// Создание класса Calculator и подключение интерфейса iCalculable
public final class Calculator implements iCalculable {
    
    private double a;
    private double b;
    // private int primaryArg;

// Конструктор класса Calculator, созд. комплексное число с заданными действительной и мнимой частями.
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

// Метод для вычисления суммы комплексных чисел
    public iCalculable sum(Calculator c) {
        // primaryArg += arg;
        a+=c.a;
        b+=c.b;
        return this;
    }

// Метод для вычисления произведения комплексных чисел
    public iCalculable multi(Calculator c) {
        // primaryArg *= arg;
        double tempA = a;
        double tempB = b;
        a = (tempA * c.a) - (tempB * c.b);
        b = (tempA * c.b) - (tempB * c.a);
        return this;
    }

// Метод для вычисления частного комплексных чисел
    public iCalculable division(Calculator c) {
        // primaryArg /= arg;
        double tempA = a;
        double tempB = b;
        double temp = (c.a * c.a) + (c.b * c.b);
        a = ((tempA * c.a) + (tempB * c.b)) / temp;
        b = ((tempB * c.a) - (tempA * c.b)) / temp;
        return this;
    }
// Метод для вызова действительной части комплексного числа
    public double getA(){
        return a;
    }
// Метод для вызова мнимой части комплексного числа
    public double getB(){
        return b;
    }

    


    // @Override
    // public double getResult() {
    //     return a;
    // }

}
