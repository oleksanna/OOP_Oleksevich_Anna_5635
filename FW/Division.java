package FW;

public class Division implements Operation {
    @Override
    public double calculate(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return x / y;
    }
}