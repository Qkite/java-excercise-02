package assignment1007;


import java.util.Scanner;

// 23조 이상이면 long 또는 BigInteger를 사용
public class Excercise1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long inputNum1 = scan.nextLong();
        long inputNum2 = scan.nextLong();
        long sumNum = Long.sum(inputNum1, inputNum2);

        System.out.println(sumNum);
        
        scan.close();
    }
}
