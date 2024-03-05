package FW;

public class Addition implements Operation {
    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}