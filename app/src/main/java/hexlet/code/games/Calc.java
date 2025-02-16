package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import  java.util.Random;
import  java.util.Scanner;

public class Calc {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greet();
        String userName = scanner.next();
        Cli.greetUser(userName);
        System.out.println("");
        System.out.println("What is the result of the expression?");

        int countOfWins = 0;
        final int attempts = 3;
        final int maxValueOfRandomNumber = 50;

        for (var i = 0; i < attempts; i++) {
            int randomNumberOne = random.nextInt(maxValueOfRandomNumber) + 1;
            int randomNumberTwo = random.nextInt(maxValueOfRandomNumber) + 1;
            String[] operations = {"+", "-", "*"};
            int operationIndex = random.nextInt(operations.length);
            String operationSymbol = operations[operationIndex];
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

            Engine.askQuestionCalc(randomNumberOne, operationSymbol, randomNumberTwo);
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();

            if (!Engine.check(result, calcResultAnswer, userName)) {
                break;
            }

            countOfWins++;
            Engine.countWins(countOfWins, attempts, userName);
        }
    }
}
