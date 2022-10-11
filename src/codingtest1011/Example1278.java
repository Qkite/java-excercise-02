package codingtest1011;

import java.util.Scanner;

public class Example1278 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int digit = 0;

        while(input >0){
            input /= 10;
            digit+=1;
        }

        System.out.println(digit);
        scan.close();
    }
}
