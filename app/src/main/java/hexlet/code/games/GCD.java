package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import  java.util.Scanner;
import  java.util.Random;

public class GCD {
    static int calculateGCD(int randomNumberOne, int randomNumberTwo) {
        if (randomNumberTwo == 0) {
            return randomNumberOne;
        } else {
            return calculateGCD(randomNumberTwo, randomNumberOne % randomNumberTwo);
        }
    }

    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);

        Engine.greet();
        String userName = scanner.next();
        Cli.greetUser(userName);
        System.out.println();
        System.out.println("Find the greatest common divisor of given numbers.");

        int countOfWins = 0;
        final int attempts = 3;
        Random random = new Random();
        final int smallestNumberMaxValue = 20;
        final int greatestNumberMaxValue = 300;

        for (var i = 0; i < attempts; i++) {
            int randomNumberOne = random.nextInt(smallestNumberMaxValue) + 1;
            int randomNumberTwo = random.nextInt(greatestNumberMaxValue) + 1;

            Engine.askQuestionGCD(randomNumberOne, randomNumberTwo);
            System.out.println("Your answer: ");
            String calcResultAnswer = scanner.next();
            if (!Engine.check(calculateGCD(randomNumberOne, randomNumberTwo), calcResultAnswer, userName)) {
                break;
            }
            countOfWins++;
            Engine.countWins(countOfWins, attempts, userName);
        }
    }
}
