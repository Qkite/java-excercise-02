package assignment1017;

import java.util.Scanner;

public class Excercise1088 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int printNum = 1;

        while (printNum <= inputNum){
            if(printNum % 3==0){
                printNum++;
                continue;
            } else{
                System.out.printf("%d ", printNum);
                printNum++;
            }
        }

    }
}
