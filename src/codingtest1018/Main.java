package codingtest1018;

import java.util.Scanner;

public class Main {

    String stars = "";

    void printTriMatrix(int n){

        if (n<=0){
            return;
        }
        stars += "*";

        System.out.println(stars);
        printTriMatrix(n-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Main makeTriangle = new Main();
        makeTriangle.printTriMatrix(num);
    }
}
