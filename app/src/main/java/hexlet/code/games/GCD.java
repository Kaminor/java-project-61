package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import  java.util.Scanner;
import  java.util.Random;

public class GCD {
    static final int GREATEST_NUMBER_MAX_VALUE = 300;
    static final int SMALLEST_NUMBER_MAX_VALUE = 20;
    private static Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        GCD.random = random;
    }


    static int calculateGCD(int randomNumberOne, int randomNumberTwo) {
        int gcdNumber = 0;

        for (var j = 1; j <= Math.max(randomNumberOne, randomNumberTwo); j++) {
            if (randomNumberOne % j == 0 && randomNumberTwo % j == 0) {
                gcdNumber = j;
            }
        }
        return gcdNumber;
    }


    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        String greetingMessage = "Welcome to the Brain Games!";

        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println();
        System.out.println("Find the greatest common divisor of given numbers.");

        int countOfWinners = 0;
        final int attempts = 3;

        for (var i = 0; i < attempts; i++) {
            int randomNumberOne = random.nextInt(GREATEST_NUMBER_MAX_VALUE) + 1;
            int randomNumberTwo = random.nextInt(SMALLEST_NUMBER_MAX_VALUE) + 1;
            calculateGCD(randomNumberOne, randomNumberTwo);

            System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();

            if (String.valueOf(calculateGCD(randomNumberOne, randomNumberTwo)).equals(calcResultAnswer)) {
                System.out.println("Correct!");
                countOfWinners++;
            } else {
                Engine.showFail(calcResultAnswer, calculateGCD(randomNumberOne, randomNumberTwo));
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWinners == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
