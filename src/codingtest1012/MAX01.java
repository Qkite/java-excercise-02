package codingtest1012;

public class MAX01 {

    public int[] getMax(int[] arr){
        

        //int maxValue=0; -> 배열의 값이 모두 음수인 경우는 0이 최댓값으로

        int maxValue = arr[0]; // 배열의 첫번째 값이 max
        int maxIdx = 0;

        // 첫번째 값으로 초기화했으므로 index 1번부터 시작하면 조금 시간을 줄일 수 있다.
        for (int i=1; i<arr.length; i++){
            if (arr[i]<maxValue){
                maxValue = arr[i];
                maxIdx = i+1;
            }
        }

        return new int[] {maxValue, maxIdx};
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};

        MAX01 max01 = new MAX01();
        int[] result = max01.getMax(arr);

        if(result[0]==85){
            System.out.println("테스트 통과");
        } else{
            System.out.printf("테스트 실패. 결과는 %d 이고 인덱스는 %d입니다.", result[0], result[1]);
        }

    }
}
