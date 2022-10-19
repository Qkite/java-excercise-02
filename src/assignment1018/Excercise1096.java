package assignment1018;

import java.util.Scanner;

public class Excercise1096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] badukBoard = new int[19][19];
        int numberOfBadukStone = Integer.valueOf(scan.nextLine());

        for (int i = 0; i < numberOfBadukStone; i++) {
            String[] locations = scan.nextLine().split(" ");
            badukBoard[Integer.valueOf(locations[0])-1][Integer.valueOf(locations[1])-1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badukBoard[i][j]);
            }
            System.out.println();
        }
    }
}

