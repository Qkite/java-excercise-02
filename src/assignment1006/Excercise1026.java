package assignment1006;

import java.util.Scanner;
public class Excercise1026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputDate = scan.next();
        String[] inputs = inputDate.split(":");
        System.out.println(Integer.valueOf(inputs[1]));
    }
}
