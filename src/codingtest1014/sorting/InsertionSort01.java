package codingtest1014.sorting;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr, int i){

        int j=i;
        if(arr[j] < arr[j-1]){
            int temp;
            temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};
        InsertionSort01 insertionSort01 = new InsertionSort01();
        arr = new int[]{5,8,6,2,4};
        int[] result = insertionSort01.sort(arr,2);

        System.out.println(Arrays.toString(result));

    }
}
