package codingtest1011;

// programmers 문제
// % 연산을 이용해서 몫과 나머지 구하기
public class Solution {

    public int solution(int n){

        int result = 0;

        while (n>0){

            result += n%10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println((solution.solution(456)));

    }
}
