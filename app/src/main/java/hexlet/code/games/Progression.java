package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import  java.util.Scanner;
import  java.util.Random;

public class Progression {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String greetingMessage = "Welcome to the Brain Games!";

        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println("");
        System.out.println("What number is missing in the progression?");

        int countOfWins = 0;
        final int attempts = 3;
        final int maxStartValue = 5;
        final int maxStepValue = 8;
        final int minStepValue = 3;
        final int progressionLength = 10;
        final int hiddenIndexValue = 9;

        for (var i = 0; i < attempts; i++) {
            int start = random.nextInt(maxStartValue);
            int step = random.nextInt(maxStepValue) + minStepValue;
            int[] progression = new int[progressionLength];

            for (var j = 0; j < progression.length; j++) {
                progression[j] = start + j * step;
            }

            int hiddenIndex = random.nextInt(hiddenIndexValue);
            int hiddenValue = progression[hiddenIndex];
            System.out.print("Question: ");

            for (int num : progression) {
                if (num == hiddenValue) {
                    System.out.print(".. ");
                } else {
                    System.out.print(num + " ");
                }
            }

            System.out.println();
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();

            if (String.valueOf(hiddenValue).equals(calcResultAnswer)) {
                System.out.println("Correct!");
                countOfWins++;
            } else {
                Engine.showFail(calcResultAnswer, hiddenValue);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWins == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
