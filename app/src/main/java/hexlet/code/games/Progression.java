package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import  java.util.Scanner;
import  java.util.Random;

public class Progression {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greet();
        String userName = scanner.next();
        Cli.greetUser(userName);
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

            Engine.askQuestionProgression(progression, hiddenValue);
            System.out.println();
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();
            if (!Engine.check(hiddenValue, calcResultAnswer, userName)) {
                break;
            }
            countOfWins++;

            Engine.countWins(countOfWins, attempts, userName);
        }
    }
}
