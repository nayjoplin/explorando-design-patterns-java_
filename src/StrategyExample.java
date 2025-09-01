// StrategyExample.java
public class StrategyExample {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int execute(int a, int b) {
        if (operation == null) {
            throw new IllegalStateException("Estratégia não definida.");
        }
        return operation.execute(a, b);
    }
}
