package assignment1017;

import java.util.Scanner;

public class Excercise1081 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int inputNum1 = Integer.valueOf(inputNums[0]);
        int inputNum2 = Integer.valueOf(inputNums[1]);

        for (int i=1; i <= inputNum1; i++){
            for (int j=1; j <= inputNum2; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }

    }
}
