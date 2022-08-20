package behavioral.strategy;

public class OperationAdd implements OperationStrategy{

    @Override
    public Integer executeOperation(int a, int b) {
        return a + b;
    }
}
