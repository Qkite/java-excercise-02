package codingtest1014.sorting;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr){
        int i=1;
        if(arr[i] < arr[i-1]){
            int temp;
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};
        InsertionSort01 insertionSort01 = new InsertionSort01();
        int[] result = insertionSort01.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
