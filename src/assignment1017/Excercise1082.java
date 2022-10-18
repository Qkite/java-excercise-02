package assignment1017;

import java.util.Scanner;

public class Excercise1082 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputAlphabet = scan.next();
        // 10 = a, 11 = b, 12 = c, 13 = d, 14 = e, 15 = f, 16 = 11
        // A는 65 ~ E는 69 -> 54 만큼 빼주기
        // 소문자 들어가면 대문자로 바꾸기

        int input = inputAlphabet.toUpperCase().charAt(0) - 55; // integer 형태로 변환

        for (int i=1; i<16; i++){
            System.out.printf("%S*%S=%S\n", Integer.toHexString(input), Integer.toHexString(i), Integer.toHexString(input*i));
            // toHexString은 String의 형태입니다!
        }

        scan.close();

    }
}
