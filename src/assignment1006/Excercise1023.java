package assignment1006;

import java.util.Scanner;

public class Excercise1023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputDouble = scan.next();

        String[] inputNums = inputDouble.split("\\.");
        /*
        .(dot)은 예약어(컴퓨터 프로그래밍 언어에서 이미 문법적인 용도로 사용되고 있기 때문에 식별자로 사용할 수 없는 단어들)
        .을 기준으로 split 하기 위해서는 예약어가 아닌 문자 "." 이라는 것을 알려줘야 한다.
        -> 역슬래시(\)를 사용하고, 역슬래시(\) 하나 또한 예약어이기 때문에 하나 더 추가해야 한다.
        출처: https://ddioniii.tistory.com/5
         */
        String intPart = inputNums[0];
        String doublePart = inputNums[1];

        System.out.println(intPart);
        System.out.println(doublePart);
    }
}
