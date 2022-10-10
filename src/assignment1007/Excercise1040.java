package assignment1007;

import java.math.BigInteger;
import java.util.Scanner;


public class Excercise1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger inputNum = scan.nextBigInteger();
        BigInteger makeNegative = BigInteger.valueOf(-1);

        BigInteger revisedNum = inputNum.multiply(makeNegative);

        System.out.println(revisedNum);
        
        scan.close();
    }
}
