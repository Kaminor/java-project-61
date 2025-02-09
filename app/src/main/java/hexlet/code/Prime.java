package hexlet.code;
import  java.util.Random;
import  java.util.Scanner;

public class Prime {
    public static void startPlay() {
        Scanner scanner = new Scanner(System.in);
        String greetingMessage = "Welcome to the Brain Games!";
        Random random = new Random();


        System.out.println(greetingMessage);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        Cli.greeting(userName);
        System.out.println();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int countOfWinners = 0;
        final int attempts = 3;
        final int randomNumberMaxValue = 30;

        for (var i = 0; i < attempts; i++) {
            int randomNumber = random.nextInt(randomNumberMaxValue) + 2;

            String correctAnswer = "yes";

            for (var j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    correctAnswer = "no";
                    break;
                }
            }


            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");

            String answer = scanner.next();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfWinners++;
            } else {
                Engine.showFail(answer, correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (countOfWinners == attempts) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
