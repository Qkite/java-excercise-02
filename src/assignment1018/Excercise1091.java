package assignment1018;

import java.util.Scanner;

public class Excercise1091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");

        // 범위를 초과할 수 있으므로  long을 사용
        long value = Integer.valueOf(inputNums[0]);
        int commonRatio = Integer.valueOf(inputNums[1]);
        int commonDiff = Integer.valueOf(inputNums[2]);
        int finalOrder = Integer.valueOf(inputNums[3]);

        // input 값이 첫번째 값 -> i를 1부터 시작함

        for(int i=1; i<finalOrder; i++){
            value = commonRatio * value + commonDiff;
        }
        System.out.println(value);

    }

}

