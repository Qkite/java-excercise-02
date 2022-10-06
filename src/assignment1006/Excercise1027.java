package assignment1006;

import java.util.Scanner;
public class Excercise1027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputDate = scan.next();
        String[] dates = inputDate.split("\\.");
        System.out.printf("%s-%s-%s", dates[2], dates[1], dates[0]);
    }
}
