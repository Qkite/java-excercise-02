package assignment1011;

import java.util.Scanner;

public class Excercise1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        long inputNum1 = Integer.valueOf(inputNums[0]);
        long inputNum2 = Integer.valueOf(inputNums[1]);

        if (inputNum1 > inputNum2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }
}
