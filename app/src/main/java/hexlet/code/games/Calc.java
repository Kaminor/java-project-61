package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Game;

import  java.util.Random;

public final class Calc implements Game {
    public String[] generate() {
        Random random = new Random();
        final int maxValueOfRandomNumber = 50;
        int randomNumberOne = random.nextInt(maxValueOfRandomNumber) + 1;
        int randomNumberTwo = random.nextInt(maxValueOfRandomNumber) + 1;
        String[] operations = {"+", "-", "*"};
        int operationIndex = random.nextInt(operations.length);
        String operationSymbol = operations[operationIndex];
        String question = randomNumberOne + " " + operationSymbol + " " + randomNumberTwo;
        int result;

        switch (operationSymbol) {
            case "+":
                result = randomNumberOne + randomNumberTwo;
                break;
            case "-":
                result = randomNumberOne - randomNumberTwo;
                break;
            case "*":
                result = randomNumberOne * randomNumberTwo;
                break;
            default:
                result = 0;
        }

        return new String[]{question, String.valueOf(result)};
    }

    public String getDescription() {
        return "What is the result of the expression?";
    }

    public static void startPlay() {
        Engine.play(new Calc());
    }
}
