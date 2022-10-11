package codingtest1011;

import java.util.*;

class Solution {
    public int solution(int n) {

        String solutionString = String.valueOf(n);

        int length = solutionString.length();

        int answer = 0;

        for(int i=0; i<length; i++){
            answer += (int) Integer.parseInt((String.valueOf(solutionString.charAt(i))));
        }

        return answer;
    }
}

public class ProgrammersExample{
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(987));

    }
}