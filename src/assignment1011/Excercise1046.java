package assignment1011;

import java.util.Scanner;

public class Excercise1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        long inputNum1 = Integer.valueOf(inputNums[0]);
        long inputNum2 = Integer.valueOf(inputNums[1]);
        long inputNum3 = Integer.valueOf(inputNums[2]);

        long sum = inputNum1 + inputNum2 + inputNum3;

        double mean = (double)sum / 3;

        System.out.println(sum);
        System.out.printf("%.1f", mean);
    }
}
