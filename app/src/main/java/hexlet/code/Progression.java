package hexlet.code;
import java.lang.reflect.Array;
import java.util.Arrays;
import  java.util.Scanner;
import  java.util.Random;

public class Progression {
    public static void getProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String greetingMessage = "Welcome to the Brain Games!";

        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println("");
        System.out.println("What number is missing in the progression?");

        int countOfWinners = 0;

        for (var i = 0; i < 3; i++) {
            int start = random.nextInt(5);
            int step = random.nextInt(8) + 3;
            int[] progression = new int[10];

            for (var j = 0; j < progression.length; j++) {
                progression[j] = start + j * step;
            }

            int hiddenIndex = random.nextInt(9);
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
                countOfWinners++;
            } else {
                Engine.showFail(calcResultAnswer, hiddenValue);
                System.out.println("Let's try again, " + userName);
                break;
            }

            if (countOfWinners == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
