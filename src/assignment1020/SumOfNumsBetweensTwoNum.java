package assignment1020;

public class SumOfNumsBetweensTwoNum {
    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        for(int i=min; i<=max; i++){
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumOfNumsBetweensTwoNum sumOfNumsBetweensTwoNum = new SumOfNumsBetweensTwoNum();
        System.out.println(sumOfNumsBetweensTwoNum.solution(15,20));
    }
}
