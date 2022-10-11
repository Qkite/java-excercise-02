package assignment1011;

import java.util.Scanner;

public class Excercise1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        long inputNum1 = Integer.valueOf(inputNums[0]);
        long inputNum2 = Integer.valueOf(inputNums[1]);

        long sum = inputNum1 + inputNum2;
        long minus = Math.abs(inputNum1 - inputNum2);
        long multiple = inputNum1 * inputNum2;
        long quotient = inputNum1/inputNum2;
        long mod = inputNum1 % inputNum2;
        double divide = (double)inputNum1 / inputNum2;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(quotient);
        System.out.println(mod);
        System.out.printf("%.2f", divide);

    }
}
