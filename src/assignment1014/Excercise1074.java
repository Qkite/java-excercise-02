package assignment1014;

import java.util.Scanner;

// while 문 이용
public class Excercise1074 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = scan.nextInt();

        while(startNum >=1){
            System.out.println(startNum);
            startNum--;
        }

    }
}
