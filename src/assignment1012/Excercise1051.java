package assignment1012;

import java.util.Scanner;
public class Excercise1051 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int num1 = Integer.valueOf(inputNums[0]);
        int num2 = Integer.valueOf(inputNums[1]);

        if(num1>num2){
            System.out.println(0);
        } else{
            System.out.println(1);
        }
    }
}
