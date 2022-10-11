package assignment1011;

import java.util.Scanner;

public class Excercise1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();

        String[] numbers= inputLine.split(" ");

        int number1 = Integer.valueOf(numbers[0]);
        int number2 = Integer.valueOf(numbers[1]);

        System.out.println(number1/number2);


    }
}
