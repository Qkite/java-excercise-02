package codingtest1017;

public class RightTriangle03 {

    private char character = '*';

    public RightTriangle03(){
        // 빈 constructor는 default 값일 때 *로 찍기를 하기 위해서 추가함
    }

    public RightTriangle03(char character){
        this.character = character;

    }

    public void writeTriangle(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.printf("%c", character);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        RightTriangle03 rightTriangle03 = new RightTriangle03('#');
        rightTriangle03.writeTriangle(8);
    }
}
