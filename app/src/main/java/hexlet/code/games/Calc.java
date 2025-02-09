package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import  java.util.Random;
import  java.util.Scanner;

public class Calc {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String greetingMessage = "Welcome to the Brain Games!";

        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println("");
        System.out.println("What is the result of the expression?");

        int countOfWinners = 0;
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

            System.out.println("Question: " + randomNumberOne + " " + operationSymbol + " " + randomNumberTwo);
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();

            if (String.valueOf(result).equals(calcResultAnswer)) {
                System.out.println("Correct!");
                countOfWinners++;
            } else {
                Engine.showFail(calcResultAnswer, result);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWinners == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
