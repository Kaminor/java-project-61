package hexlet.code;
import  java.util.Scanner;
import  java.util.Random;

public class GCD {
    public static void findGCD() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String greetingMessage = "Welcome to the Brain Games!";

        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println();
        System.out.println("Find the greatest common divisor of given numbers.");

        int countOfWinners = 0;
        final int attempts = 3;
        final int greatestNumberMaxValue = 300;
        final int smallestNumberMaxValue = 20;

        for (var i = 0; i < attempts; i++) {
            int randomNumberOne = random.nextInt(greatestNumberMaxValue) + 1;
            int randomNumberTwo = random.nextInt(smallestNumberMaxValue) + 1;
            int gcdNumber = 0;

            for (var j = 1; j <= Math.max(randomNumberOne, randomNumberTwo) / 2; j++) {
                if (randomNumberOne % j == 0 && randomNumberTwo % j == 0) {
                    gcdNumber = j;
                }
            }

            System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
            System.out.println("Your answer: ");

            String calcResultAnswer = scanner.next();

            if (String.valueOf(gcdNumber).equals(calcResultAnswer)) {
                System.out.println("Correct!");
                countOfWinners++;
            } else {
                Engine.showFail(calcResultAnswer, gcdNumber);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWinners == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
