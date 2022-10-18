package assignment1014;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1079 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs = scan.nextLine().split(" ");

        // 1번        
//        for (String input:inputs) {
//            if(input.charAt(0) == 'q'){
//                break;
//            } else{
//                System.out.println(input);
//            }
//        }
//        System.out.println("q");

        // 2번
        int endidx = Arrays.asList(inputs).indexOf("q");

        for (int i=0; i<= endidx; i++){
            System.out.println(inputs[i]);
        }
    }
}
