package assignment1018;

import java.util.Scanner;

public class Excercise1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfCall = Integer.valueOf(scan.nextLine());
        String[] inputNums = scan.nextLine().split(" ");

        for (int i = numOfCall-1; i >= 0; i--) {
            System.out.printf("%s ", inputNums[i]);
        }
    }
}

