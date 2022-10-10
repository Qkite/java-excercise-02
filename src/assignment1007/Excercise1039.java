package assignment1007;

import java.math.BigInteger;
import java.util.Scanner;


public class Excercise1039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger inputNum1 = scan.nextBigInteger();
        BigInteger inputNum2 = scan.nextBigInteger();

        BigInteger sumNum = inputNum1.add(inputNum2);

        System.out.println(sumNum);
        
        scan.close();
    }
}
