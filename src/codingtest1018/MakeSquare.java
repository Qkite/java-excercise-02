package codingtest1018;


public class MakeSquare {

    void printSquareMatirx(int n){
        for (int i=0; i<n; i++){
            System.out.println("*".repeat(n));
        }

    }

    public static void main(String[] args) {

        MakeSquare makeSquare = new MakeSquare();
        makeSquare.printSquareMatirx(10);

    }
}
