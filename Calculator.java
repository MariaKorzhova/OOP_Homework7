

public final class Calculator implements iCalculable {
    
    private double a;
    private double b;
    // private int primaryArg;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // @Override
    public iCalculable sum(Calculator c) {
        // primaryArg += arg;
        a+=c.a;
        b+=c.b;
        return this;
    }

    // @Override
    public iCalculable multi(Calculator c) {
        // primaryArg *= arg;
        double tempA = a;
        double tempB = b;
        a = (tempA * c.a) - (tempB * c.b);
        b = (tempA * c.b) - (tempB * c.a);
        return this;
    }

    // @Override
    public iCalculable division(Calculator c) {
        // primaryArg /= arg;
        double tempA = a;
        double tempB = b;
        double temp = (c.a * c.a) + (c.b * c.b);
        a = ((tempA * c.a) + (tempB * c.b)) / temp;
        b = ((tempB * c.a) - (tempA * c.b)) / temp;
        return this;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    


    // @Override
    // public double getResult() {
    //     return a;
    // }

}
