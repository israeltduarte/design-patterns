package behavioral.chain;

public class DaggerProcessor extends Processor {

    private Integer price = 20;

    public DaggerProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Integer goldAmount) {
        if (goldAmount >= this.price) {
            System.out.println("a dagger of price " + this.price + " will be bought.");
        } else {
            super.process(goldAmount);
        }
    }
}
