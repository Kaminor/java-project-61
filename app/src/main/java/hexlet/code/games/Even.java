package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import  java.util.Random;
import  java.util.Scanner;

public class Even {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greet();
        String userName = scanner.next();
        Cli.greetUser(userName);
        System.out.println();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countOfWins = 0;
        final int attempts = 3;
        final int maxPossibleValue = 100;

        for (var i = 0; i < attempts; i++) {
            int randomNumber = random.nextInt(maxPossibleValue) + 1;
            Engine.askQuestionPrimeOrEven(randomNumber);
            System.out.println("Your answer: ");

            String isEvenAnswer = scanner.next();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            if (!Engine.check(correctAnswer, isEvenAnswer, userName)) {
                break;
            }
            countOfWins++;

            Engine.countWins(countOfWins, attempts, userName);
        }
    }
}
