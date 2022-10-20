package assignment1020;

public class WatermelonQuiz {
    public String solution(int n) {
        String answer = "";

        String first = "수박".repeat(5000);

        // 반복문을 통해서 집어넣을 수 있음
        for(int i=0; i<n; i++){
            answer += String.valueOf(first.charAt(i));
        }


        // substring을 통해 문자열을 끊을 수 있음
        // answer += first.substring(0,n);

        return answer;
    }

    public static void main(String[] args) {
        WatermelonQuiz watermelonQuiz = new WatermelonQuiz();
        System.out.println(watermelonQuiz.solution(10));
    }
}
