package assignment1007;

import java.util.Scanner;

public class Excercise1034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNum = scan.next();
        int revisedNum = Integer.parseInt(inputNum, 8);

        System.out.println(revisedNum);
        
        scan.close();
    }
}
