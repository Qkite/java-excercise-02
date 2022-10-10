package assignment1007;

import java.util.Scanner;

public class Excercise1035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNum = scan.next();
        int revisedNum = Integer.parseInt(inputNum, 16);
        int finalNum = Integer.parseInt(Integer.toOctalString(revisedNum));

        System.out.println(finalNum);
        
        scan.close();
    }
}
