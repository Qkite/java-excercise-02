package assignment1018;

import java.util.Arrays;
import java.util.Scanner;


public class Excercise1095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfCall = Integer.valueOf(scan.nextLine());
        String[] inputNums = scan.nextLine().split(" ");

        int[] inputArray = new int[numOfCall];

        for (int i = 0; i < numOfCall; i++) {
            inputArray[i] = Integer.valueOf(inputNums[i]);
        }
        
        // 정렬 알고리즘 다시 공부하기 

        for (int i=0; i<numOfCall; i++){
            for (int j = i; j < numOfCall-1 ; j++) {
                if(inputArray[j] > inputArray[j+1]){
                    int temp;
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(inputArray));
    }
}

