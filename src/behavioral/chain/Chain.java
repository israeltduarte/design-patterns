package behavioral.chain;

public class Chain {

    private Processor chain;

    public Chain() {}

    public void process(Integer goldAmount){
        chain.process(goldAmount);
    }

    public Processor getChain() {
        return chain;
    }

    public void setChain(Processor chain) {
        this.chain = chain;
    }

    
}
