package assignment1018;

import java.util.Scanner;

public class Excercise1092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");

        int num1 = Integer.valueOf(inputNums[0]);
        int num2 = Integer.valueOf(inputNums[1]);
        int num3 = Integer.valueOf(inputNums[2]);


        for(int i=num3; i<=num1*num2*num3; i++){
            if((i % num1 ==0)&&(i % num2 ==0)&&(i % num3 ==0)){
                System.out.println(i);
                break;
            }
        }
    }
}

