package ListExcer;


import java.util.HashMap;
import java.util.Map;

public class AlphabetCnt {


    public static boolean isAlphabet(char letter){

        // 65~90 영어 대문자
        // 97~122 영어 소문자

        if ((letter>='a') && (letter<='z')){
            return true;
        } else if ((letter >='A') && (letter<='Z')){
            return true;
        } else{
            return false;
        }


    }

    public static void main(String[] args) {
        String s1 = "aaabbccddefghhiijkl...l".toUpperCase();

        Map<String, Integer> alphabetMap = new HashMap<>();

        for (int i=0; i<26; i++){
            alphabetMap.put(Character.toString((char)(i+65)),0);
        }



        for (int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            boolean isAlphabet = isAlphabet(c);
            if (isAlphabet == true){
                alphabetMap.put(String.valueOf(c),(alphabetMap.get(String.valueOf(c)) +1));

            }
        }

    }
}
