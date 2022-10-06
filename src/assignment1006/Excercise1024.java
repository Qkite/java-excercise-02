package assignment1006;

import java.util.Scanner;
public class Excercise1024 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        for (int i=0; i<input.length(); i++){
            System.out.print("'");
            System.out.print(input.charAt(i));
            System.out.println("'");
        }
    }
}
