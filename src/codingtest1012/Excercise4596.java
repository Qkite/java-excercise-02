package codingtest1012;

import java.util.Scanner;

public class Excercise4596 {

    public static void main(String[] args) {

        int max = 0;
        int maxi = 0;
        int maxj = 0;

        for(int i=1; i<=9; i++){

            Scanner scan = new Scanner(System.in);

            String[] inputLine = scan.nextLine().split(" ");

            for (int j=0; j<9;j++) {
                if (max<Integer.valueOf(inputLine[j])){
                    max = Integer.valueOf(inputLine[j]);
                    maxi = i;
                    maxj = j+1;
                } else {
                    continue;
                }

            }

        }

        System.out.println(max);
        System.out.printf("%d %d", maxi, maxj);


    }

}
