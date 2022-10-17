package codingtest1017;

public class MakePyramid {

    private char character = '*';

    public MakePyramid(){
        // 빈 constructor는 default 값일 때 *로 찍기를 하기 위해서 추가함
    }

    public MakePyramid(char character){
        this.character = character;

    }

    public void writePyramid(int n){
        for (int i = 1; i <= n; i++){
            for (int j=n-i; j>=0; j--){

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
    }

    public static void main(String[] args) {
        MakePyramid rightTriangle03 = new MakePyramid('#');
        rightTriangle03.writePyramid(8);
    }
}
