package codingtest1017;

public class RightTriangle02 {


    public void writeTriangle(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        RightTriangle02 rightTriangle02 = new RightTriangle02();

        rightTriangle02.writeTriangle(10);


    }
}
