package assignment1007;

import java.util.Scanner;

public class Excercise1031 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt(); 
        
        // 8진수로 변환
//        String revisedNum = Integer.toOctalString(inputNum);
//
//        System.out.println(revisedNum);
        System.out.printf("%o", inputNum);
        
        scan.close();
    }
}
