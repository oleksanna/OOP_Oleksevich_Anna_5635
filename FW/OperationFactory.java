package FW;

public class OperationFactory {
    public static Operation createOperation(char operationSymbol) {
        switch (operationSymbol) {
            case '+':
                return new Addition();
            case '*':
                return new Multiplication();
            case '/':
                return new Division();
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция: " + operationSymbol);
        }
    }
}
