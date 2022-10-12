package codingtest1012;

// 최댓값1

import java.util.Scanner;

public class Excercise2081 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNum = 0;
        int index = 0;
        for (int i=0; i<9; i++){
            int input = scan.nextInt();

            if (maxNum<input){
                maxNum = input;
                index = i+1;
            } else{
                continue;

            }

        }

        System.out.println(maxNum);
        System.out.println(index);
    }
}
