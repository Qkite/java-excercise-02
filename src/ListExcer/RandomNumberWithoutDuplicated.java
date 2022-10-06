package ListExcer;


import java.util.HashSet;
import java.util.Set;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator11 randomNumberGenerator11 = new RandomNumberGenerator11();

        // 중복제거
        Set<Integer> dupliOut = new HashSet<>();

        for (int i=0; i<50 ; i++){
            int r = randomNumberGenerator11.generate(10);
            System.out.println(r);
            dupliOut.add(r);
        }

        System.out.println(dupliOut);




    }
}
