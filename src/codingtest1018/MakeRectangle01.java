package codingtest1018;


import java.util.Scanner;

public class MakeRectangle01 {

    String firstAndLast = "*";
    String others = "*";

    void printRectangle(int n){

        // 처음, 마지막에는 n개
        // n-2개의 줄에는 1개, 공백 n-2개, 1개

        for(int i=0; i<n; i++){
            System.out.print("*");

        }
        System.out.println();
        for(int i=1; i<n-1; i++){
            System.out.print("*");
            for(int j=1; j<n-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.print("*");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        MakeRectangle01 makeRectangle01 = new MakeRectangle01();
        makeRectangle01.printRectangle(num);

    }
}
