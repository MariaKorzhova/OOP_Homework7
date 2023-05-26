

import java.util.Scanner;
//  Создание класса ViewCalculator
public class ViewCalculator {

    private iCalculableFactory calculableFactory;
// Конструктор класса ViewCalculator
    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
// Метод для вызова возможных команд калькулятора
    public void run() {
        while (true) {
            double a = promptInt("Введите действительную часть комплексного числа: ");
            double b = promptInt("Введите мнимую часть комплексного числа: ");
            iCalculable calculator = calculableFactory.create(a, b);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    // int arg = promptInt("Введите второй аргумент: ");
                    double c = promptInt("Введите действительную часть комплексного числа: ");
                    double d = promptInt("Введите мнимую часть комплексного числа: ");
                    iCalculable calculator1 = calculableFactory.create(c, d);
                    calculator.multi((Calculator)calculator1);
                    continue;
                }
                if (cmd.equals("+")) {
                    double c = promptInt("Введите действительную часть комплексного числа: ");
                    double d = promptInt("Введите мнимую часть комплексного числа: ");
                    iCalculable calculator2 = calculableFactory.create(c, d);
                    calculator.sum((Calculator)calculator2);
                    continue;
                }
                if (cmd.equals("/")) {
                    double c = promptInt("Введите действительную часть комплексного числа: ");
                    double d = promptInt("Введите мнимую часть комплексного числа: ");
                    iCalculable calculator3 = calculableFactory.create(c, d);
                    calculator.division((Calculator)calculator3);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result1 = calculator.getA();
                    double result2 = calculator.getB();
                    System.out.printf("Результат %f + %f i \n", result1, result2);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
// Метод для вызова сообщения
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
// Метод для ввода сообщения
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
