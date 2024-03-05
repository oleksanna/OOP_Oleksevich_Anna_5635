package FW;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double performCalculation(double x, double y) {
        double result = operation.calculate(x, y);
        System.out.println("Результат операции: " + result);
        return result;
    }
}