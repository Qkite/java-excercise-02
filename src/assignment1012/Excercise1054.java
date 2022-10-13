package assignment1012;

import java.util.Scanner;

public class Excercise1054 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int inputNum1 = Integer.valueOf(inputNums[0]);
        int inputNum2 = Integer.valueOf(inputNums[1]);

        if (inputNum1*inputNum2==1){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}
