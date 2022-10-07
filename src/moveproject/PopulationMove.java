package moveproject;

public class PopulationMove {
    private int fromAddress, toAddress;

    public PopulationMove(int fromAddress, int toAddress){
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public int getFromAddress(){
        return fromAddress;
    }

    public int getToAddress(){
        return toAddress;
    }


}
