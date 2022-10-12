package codingtest1012;

import java.util.Arrays;

// 비교하는 것이 공통이므로 인터페이스로 뺀다
interface Compare {
    boolean doSomething(int valueA, int valueB);
    
}

// max와 min을 둘 다 구할 수 있는 메소드
public class MaxAndMin {

    // 메소드를 private하게 해서 다른 곳에서 수정하지 못하게
    private int[] getMaxOrMin(int[] arr, Compare compare){// callback

        //int maxValue=0; -> 배열의 값이 모두 음수인 경우는 0이 최댓값으로

        int targetValue = arr[0]; // 배열의 첫번째 값이 max
        int targetIdx = 0;

        // 첫번째 값으로 초기화했으므로 index 1번부터 시작하면 조금 시간을 줄일 수 있다.
        for (int i=1; i<arr.length; i++){
            boolean isSth = compare.doSomething(arr[i], targetValue);
            if (isSth){
                targetValue = arr[i];
                targetIdx = i+1;
            }
        }

        return new int[] {targetValue, targetIdx};
    }
    
    public int[] max(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB; // A가 B보다 클 때 바꿈
            } // 내부 클래스 생성
        });
    }

    public int[] min(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB; // A가 B보다 클 때 바꿈
            } // 내부 클래스 생성
        });
        
    }
    
    // 람다 문법을 쓰면 더 간략하게 됨 -> 람다는 이후에

    public static void main(String[] args) {
        
        int[] arr = new int[]{3,29,38,12,57,40,56,94};
        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println(Arrays.toString(maxAndMin.min(arr)));
        System.out.println(Arrays.toString(maxAndMin.max(arr)));

    }
}


