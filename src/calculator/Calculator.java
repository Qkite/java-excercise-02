package calculator;

public class Calculator {

    NumberGenerator numberGenerator;

    int num, randomNum;

    public Calculator(int num, int randomNum){
        this.num = num;
        this.randomNum = randomNum;
    }

    public void plus(){
        System.out.println(num + randomNum);
    }
}
