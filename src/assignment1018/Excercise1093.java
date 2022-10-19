package assignment1018;

import java.util.Scanner;

public class Excercise1093 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfCall = Integer.valueOf(scan.nextLine());
        String[] inputNums = scan.nextLine().split(" ");

        int[] studentCount = new int[23];

        for (String num: inputNums){
            int studentNum = Integer.valueOf(num);
            studentCount[studentNum-1] += 1;
        }

        for (int num: studentCount) {
            System.out.printf("%d ", num);

        }
    }
}

