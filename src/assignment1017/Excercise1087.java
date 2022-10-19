package assignment1017;

import java.util.Scanner;

public class Excercise1087 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNums = scan.nextInt();
        int sum = 0;
        int idx = 1;

        while(sum<inputNums){
            sum += idx;
            idx++;
        }

        System.out.println(sum);
    }
}
