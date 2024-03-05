package FW;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите операцию (+, *, /): ");
        char operationSymbol = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        Operation operation = OperationFactory.createOperation(operationSymbol);
        Calculator calculator = new Calculator(operation);

        double result = calculator.performCalculation(x, y);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Результат: " + x + " " + operationSymbol + " " + y + " = " + df.format(result));
    }
}