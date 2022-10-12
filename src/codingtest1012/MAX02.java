package codingtest1012;

public class MAX02 {

    public int getMax(int[] arr){
        

        //int maxValue=0; -> 배열의 값이 모두 음수인 경우는 0이 최댓값으로

        int maxValue = arr[0]; // 배열의 첫번째 값이 max
        
        for (int i=0; i<arr.length; i++){
            if (arr[i]<maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};

        MAX02 max02 = new MAX02();
        int result = max02.getMax(arr);

        if(result==85){
            System.out.println("테스트 통과");
        } else{
            System.out.println("테스트 실패. 결과는"+result);
        }

    }
}
