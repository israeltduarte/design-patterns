package behavioral.strategy;

public class Context {

    private OperationStrategy operationStrategy;

    public Context(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public Integer executeStrategy(Integer a, Integer b) {
        return operationStrategy.executeOperation(a, b);
    }
}
