package codingtest1014.sorting;

import java.util.Arrays;

public class InsertionSort01 {

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
        int[] arr = {8,5,6,2,4};
        InsertionSort01 insertionSort01 = new InsertionSort01();
        int[] result = insertionSort01.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
