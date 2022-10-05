package assignment_1005;

import java.util.Scanner;

public class Excercise1014 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter1 = scan.next().charAt(0);
        char letter2 = scan.next().charAt(0);

        System.out.printf("%c %c", letter2, letter1);
    }

}
