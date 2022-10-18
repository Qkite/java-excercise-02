package assignment1017;

import java.util.Scanner;

public class Excercise1083 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for (int i=1; i<=inputNum; i++){
            if (i%3 ==0){
                System.out.print("X ");
            } else{
                System.out.printf("%d ", i);
            }
        }

    }
}
