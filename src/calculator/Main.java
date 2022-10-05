package calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();

        Calculator randomNumberCalculator = new Calculator(20, numberGenerator.generate(10));
        randomNumberCalculator.plus();

        NumberGenerator specificNumberGenerator = new SpecificNumberGenerator();

        Calculator specificNumberCalculator = new Calculator(20, specificNumberGenerator.generate(10));
        specificNumberCalculator.plus();





    }
}
