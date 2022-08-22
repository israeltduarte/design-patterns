package behavioral.chain;

public class Processor {
    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(Integer goldAmount) {
        if (nextProcessor != null) {
            nextProcessor.process(goldAmount);
        } else {
            System.out.println("nothing will be bought.");
        }
    }
}
