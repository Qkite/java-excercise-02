package assignment1011;

import java.util.Scanner;


// Integer의 범위 때문에 long을 이용하자!
public class Excercise1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();

        long result = ++input;

        System.out.println(result);


    }
}
