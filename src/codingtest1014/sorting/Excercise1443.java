package codingtest1014.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class Excercise1443 {

    private int[] arr;

    public int[] sort(int[] arr){
        for (int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];

        for(int i=0; i<arrSize; i++){
            arr[i] = scan.nextInt();
        }

        Excercise1443 main = new Excercise1443();
        int[] result = main.sort(arr);

        for(int i=0; i<arrSize; i++){
            System.out.println(arr[i]);
        }

    }
}
