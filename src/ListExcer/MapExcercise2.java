package ListExcer;

import java.util.HashMap;
import java.util.Map;

public class MapExcercise2 {
    public static void main(String[] args) {

        String repoAddr = "https://github.com/seanee3670/CodeLion/tree/master/src";
        String repoAddrLower = repoAddr.toLowerCase(); // 소문자 변환

        Map<String, Integer> alphabetCnt = new HashMap<>();

        // 65~90 영어 대문자
        // 97~122 영어 소문자
        // map에 글자 먼저 넣기

        for (int i=0; i<26; i++){
            alphabetCnt.put(Character.toString((char)(i+97)),0);
        }


        // map의 key 값을 이용해서 알파벳 문자인지 확인하기
        for (int i=0; i<repoAddr.length();i++){
            String letter = String.valueOf(repoAddrLower.charAt(i));
            if (alphabetCnt.keySet().contains(letter)){
                alphabetCnt.put(letter,(alphabetCnt.get(letter) +1));
            }
        }

        System.out.println(alphabetCnt.get("b"));
        System.out.println(alphabetCnt.get("c"));
        System.out.println(alphabetCnt.get("r"));

    }
}


