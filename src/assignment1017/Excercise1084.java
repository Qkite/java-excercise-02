package assignment1017;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Excercise1084 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int inputNum1 = Integer.valueOf(inputNums[0]);
        int inputNum2 = Integer.valueOf(inputNums[1]);
        int inputNum3 = Integer.valueOf(inputNums[2]);



        System.out.println(inputNum1*inputNum2*inputNum3);
    }
}
