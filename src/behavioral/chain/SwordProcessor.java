package behavioral.chain;

public class SwordProcessor extends Processor {

    private Integer price = 40;

    public SwordProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Integer goldAmount) {
        if(goldAmount >= this.price) {
            System.out.println("a sword of price " + this.price + " will be bought.");
        } else {
            super.process(goldAmount);
        }
    }
}
