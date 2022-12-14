package codingtest1014.sorting;

import java.util.Arrays;

public class InsertionSort02 {
    // 재귀 이용
    public int[] sort(int[] arr, int i){

        if(i==arr.length){
            return arr;
        }

        for(int j=i; j>0; j--){
            if(arr[j] < arr[j-1]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        return sort(arr, i+1);
    }


    public static void main(String[] args) {
        //int[] arr = {8,5,6,2,4};
        int[] arr = {8,5,6,2,4,5,7};
        InsertionSort02 insertionSort01 = new InsertionSort02();
        int[] result = insertionSort01.sort(arr,1); // i가 1부터 시작하기 때문에 1을 넣음

        System.out.println(Arrays.toString(result));

    }
}
