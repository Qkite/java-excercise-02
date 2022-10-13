package codingtest1013.sorting;

import java.util.Arrays;

public class BubbleSort01 {

    public int[] sorting(int[] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){

                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort01 bubbleSort01  = new BubbleSort01();
        int[] arr = new int[]{7,2,3,9,28,11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘

        int[] revisedArr= bubbleSort01.sorting(arr);

        System.out.println(Arrays.toString(revisedArr));


    }
}
