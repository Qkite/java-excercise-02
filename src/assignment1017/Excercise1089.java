package assignment1017;

import java.util.Scanner;

public class Excercise1089 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int value = Integer.valueOf(inputNums[0]);
        int commonDiff = Integer.valueOf(inputNums[1]);
        int finalOrder = Integer.valueOf(inputNums[2]);

        // input 값이 첫번째 값 -> i를 1부터 시작함

        for(int i=1; i<finalOrder; i++){
            value += commonDiff;
        }
        System.out.println(value);
    }
}
