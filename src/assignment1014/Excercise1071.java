package assignment1014;

import java.util.Scanner;

public class Excercise1071 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");

        for (String inputNum:inputNums) {
            if (Integer.valueOf(inputNum) == 0){
                break;
            } else{
                System.out.println(inputNum);
            }
        }
    }
}
