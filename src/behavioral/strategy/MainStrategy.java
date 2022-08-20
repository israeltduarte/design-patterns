package behavioral.strategy;

public class MainStrategy {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("Operation Add result: " + context.executeStrategy(4, 5));

        context = new Context(new OperationSubtract());
        System.out.println("Operation Subtract result: " + context.executeStrategy(5, 4));
    }
}
