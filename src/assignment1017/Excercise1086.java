package assignment1017;

import java.util.Scanner;

public class Excercise1086 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        long weight = Integer.valueOf(inputNums[0]);
        long height = Integer.valueOf(inputNums[1]);
        long bit = Integer.valueOf(inputNums[2]);
        
        // integer로 하면 한계를 넘어가서 오류가 생김

        double save = weight*height*bit/(8*Math.pow(2,10)*Math.pow(2,10));

        System.out.printf("%.2f MB", save);
    }
}
