package assignment1014;

import java.util.Scanner;

public class Excercise1080 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int afterSum = scan.nextInt();
        int sum =0;
        int idx = 0;
        while(sum < afterSum){
            idx++;
            sum += idx; // 증가한 수를 더해야 함
            // sum에 먼저 더하고 증가하면 그 다음 숫자가 나옴
        }
        System.out.println(idx);
    }
}
