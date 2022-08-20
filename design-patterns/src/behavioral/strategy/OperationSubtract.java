package behavioral.strategy;

public class OperationSubtract implements OperationStrategy {

    @Override
    public Integer executeOperation(int a, int b) {
        return a - b;
    }
}
