package ListExcer;


import java.util.HashSet;
import java.util.Set;

public class RandomLetterWithoutDuplicated {
    public static void main(String[] args) {

        RandomLetterGenerator randomLetterGenerator = new RandomLetterGenerator();

        // 중복제거
        Set<Character> alphabetDupliOut = new HashSet<>();

        for (int i=0; i<50 ; i++){
            char alphabet = randomLetterGenerator.generate();
            alphabetDupliOut.add(alphabet);
        }

        System.out.println(alphabetDupliOut);




    }
}
