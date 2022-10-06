package ListExcer;

public class RandomNumberGenerator11 implements NumberGenerator11{

    @Override
    public int generate (int num){
        return (int)(Math.random()*num);

    }
}
