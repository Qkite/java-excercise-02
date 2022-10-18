package assignment1014;

import java.util.Scanner;

public class Excercise1078 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int sum = 0;

        for(int i=1; i<=start; i++){
            if(i%2 ==0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
