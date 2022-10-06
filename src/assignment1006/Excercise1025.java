package assignment1006;

import java.util.Scanner;
public class Excercise1025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputInteger = scan.nextInt();
        int[] dividingNums = {10000,1000,100,10,1};

        for (int dividingNum: dividingNums) {
            System.out.print("[");
            System.out.print((inputInteger/dividingNum)*dividingNum);
            System.out.println("]");
            inputInteger %= dividingNum; // 나머지를 return
        }
    }
}
