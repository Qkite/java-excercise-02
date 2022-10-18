package assignment1014;

import java.util.Scanner;

// 어떻게 하지...? 왜 input이 제대로 안 받아지지?
// 다른 scanner?
public class Excercise1072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] inputNums = scan.nextLine().split(" ");

        for (int i=0; i<num; i++){
            System.out.println(inputNums[i]);
        }


//        for (String inputNum:inputNums) {
//            System.out.println(inputNum);
//        }
    }
}
