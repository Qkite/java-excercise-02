package codingtest1011;

import java.util.Scanner;

public class Example1620 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();



        while(input >= 10){

            int digitSum = 0;

            while(input > 0){

                digitSum += input%10;
                input /= 10;
            }

            input = digitSum;
        }


        System.out.println(input);
        scan.close();
    }
}
