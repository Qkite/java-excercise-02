package codingtest1018;


public class MakeRectangle {

    void printRegMatirx(int m, int n){
        for (int i=0; i<n; i++){
            System.out.println("*".repeat(m));
        }

    }

    public static void main(String[] args) {
        MakeRectangle makeRectangle = new MakeRectangle();
        makeRectangle.printRegMatirx(10,5);

    }
}
