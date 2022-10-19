package assignment1017;

import java.util.Scanner;

public class Excercise1085 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        long hertz = Integer.valueOf(inputNums[0]);
        long bit = Integer.valueOf(inputNums[1]);
        long channel = Integer.valueOf(inputNums[2]);
        long second = Integer.valueOf(inputNums[3]);
        
        // integer로 하면 한계를 넘어가서 오류가 생김

        double save = hertz*bit*channel*second/(8*Math.pow(2,10)*Math.pow(2,10));

        System.out.printf("%.1f MB", save);
    }
}
