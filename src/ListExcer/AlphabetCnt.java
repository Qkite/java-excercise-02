package ListExcer;



public class AlphabetCnt {


    public static boolean isAlphabet(char letter){

        // 65~90 영어 대문자
        // 97~122 영어 소문자

        if ((letter>=65) && (letter<=90)){
            return true;
        } else if ((letter >=97) && (letter<=122)){
            return true;
        } else{
            return false;
        }


    }

    public static void main(String[] args) {
        String s1 = "aaabbccddefghhiijkl...l";

        for (int i=0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));
            System.out.println(isAlphabet(s1.charAt(i)));
        }

    }
}
