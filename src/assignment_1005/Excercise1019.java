package assignment_1005;

import java.util.Scanner;
public class Excercise1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] date = scan.next().split("\\.");
        // .가 문법적인 표현 -> \\를 사용해야함
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
    }
}
