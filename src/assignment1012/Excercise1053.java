package assignment1012;

import java.util.Scanner;

public class Excercise1053 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        int revisedNum = (inputNum+1)%2;

        System.out.println(revisedNum);

    }
}
