package assignment1014;

import java.util.Scanner;

// while 문 이용
public class Excercise1073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        int idx = 0;

        while(Integer.valueOf(inputNums[idx]) != 0){
            System.out.println(inputNums[idx]);
            idx++;
        }

    }
}
