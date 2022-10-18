package assignment1014;

import java.util.Scanner;


public class Excercise1076 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        int revised = start.toLowerCase().charAt(0)+0; // int로 변환

        // a=97

        for(int i=97; i<=revised; i++){
            System.out.printf("%c ", (char)i);
        }

    }
}
