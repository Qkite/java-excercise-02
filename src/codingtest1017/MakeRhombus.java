package codingtest1017;

public class MakeRhombus {

    private char character = '*';

    public MakeRhombus(){
        // 빈 constructor는 default 값일 때 *로 찍기를 하기 위해서 추가함
    }

    public MakeRhombus(char character){
        this.character = character;

    }

    public void writePyramid(int n){
        // n번
        for (int i = 1; i <= n; i++){
            for (int j=0; j<=n-i; j++){

                System.out.print(" ");
                // 2n-1개의 별
                // n-i개의 빈칸
            }
            for (int j=1; j <= (2*i-1); j++){
                System.out.printf("%c", character);
                // 2n-1개의 별
                // n-i개의 빈칸
            }
            System.out.print("\n");
        }

        // n-1번
        for (int i = 1; i <= n; i++){
            for (int j=0; j<=i; j++){

                System.out.print(" ");
                // 2n-1개의 별
                // n-i개의 빈칸
            }
            for (int j=1; j <= (2*n-2*i-1); j++){
                System.out.printf("%c", character);
                // 2n-1개의 별
                // n-i개의 빈칸
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        MakeRhombus rightTriangle03 = new MakeRhombus('#');
        rightTriangle03.writePyramid(8);
    }
}
