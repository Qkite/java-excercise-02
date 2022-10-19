package assignment1014;

import java.util.Scanner;

// 어떻게 하지...? 왜 input이 제대로 안 받아지지?
// nextInt()를 이용하면 한번 input을 넣으면 scanner가 끝남
// nextLine()을 이용해서 여러 줄을 받을 수 있게 하는 것이 좋음


public class Excercise1072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().replaceAll("[^0-9]", "");

        // 숫자가 아닌 것들을 다 제거

        int num = Integer.parseInt(input);
        String[] inputNums = scan.nextLine().split(" ");

//        for (int i=0; i<num; i++){
//            System.out.println(inputNums[i]);
//        }

        for (String inputNum:inputNums) {
            System.out.println(inputNum);
        }
    }
}
